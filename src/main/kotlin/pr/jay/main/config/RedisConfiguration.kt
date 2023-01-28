package pr.jay.main.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.data.redis.cache.CacheKeyPrefix
import org.springframework.data.redis.cache.RedisCacheConfiguration
import org.springframework.data.redis.cache.RedisCacheManager
import org.springframework.data.redis.connection.RedisStandaloneConfiguration
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer
import org.springframework.data.redis.serializer.RedisSerializationContext
import org.springframework.data.redis.serializer.StringRedisSerializer
import java.time.Duration

@Configuration
class RedisConfiguration {

    private val primaryHost = "192.168.35.101"
    private val primaryPort = 6379
    private val readerHost = ""
    private val readerPort = 0
    private val expire = 8L
    /**
     * Redis Connection 설정
     *   - Write: Master Redis
     *   - Read: Replica Redis
     * @return LettuceConnectionFactory
     */


        @Bean
        fun redisConnectionFactory(): LettuceConnectionFactory {
            val configuration = RedisStandaloneConfiguration()
            configuration.hostName = primaryHost
            configuration.port = primaryPort
//        configuration.password = RedisPassword.of(redisPassword)
            return LettuceConnectionFactory(configuration)
        }


    @Primary
    @Bean(name = ["memberManager"])
    fun memberManager(): RedisCacheManager {
        val configuration = RedisCacheConfiguration.defaultCacheConfig()
                .serializeKeysWith(RedisSerializationContext.SerializationPair.fromSerializer(StringRedisSerializer()))
                .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(GenericJackson2JsonRedisSerializer()))   // json 형식으로 value 저장
                .computePrefixWith(CacheKeyPrefix.simple())             // key앞에 '::'를 삽입
                .disableCachingNullValues()                             // null 값 금지
                .entryTtl(Duration.ofHours(expire))                     // 캐싱 유지 시간 설정

        return RedisCacheManager.RedisCacheManagerBuilder
                .fromConnectionFactory(redisConnectionFactory())
                .cacheDefaults(configuration)
                .build()
    }
}