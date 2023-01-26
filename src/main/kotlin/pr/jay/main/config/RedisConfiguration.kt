package pr.jay.main.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.RedisStandaloneConfiguration
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory

@Configuration
class RedisConfiguration {

    private val primaryHost = "192.168.35.101"
    private val primaryPort = 6379
    private val readerHost = ""
    private val readerPort = 0

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
}