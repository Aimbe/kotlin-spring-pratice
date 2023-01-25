package pr.jay.main.config

import org.springframework.context.annotation.Bean

@
class RedisConfiguration {

    private val primaryHost = ""
    private val primaryPort = 0
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
        // Primary, Replica Config
        val elastiCache = RedisStaticMasterReplicaConfiguration(primaryHost, primaryPort)
        elastiCache.addNode(readerHost, readerPort)

        // 1) lettuce 사용
        val clientConfig = LettuceClientConfiguration.builder()
                .readFrom(ReadFrom.REPLICA_PREFERRED)  // 2)
                .build()

        return LettuceConnectionFactory(elastiCache, clientConfig)
    }


        @Bean
        fun redisConnectionFactory(): LettuceConnectionFactory {
            val configuration = RedisStandaloneConfiguration()
            configuration.hostName = redisHost
            configuration.port = redisPort
//        configuration.password = RedisPassword.of(redisPassword)
            return LettuceConnectionFactory(configuration)
        }
    }
}