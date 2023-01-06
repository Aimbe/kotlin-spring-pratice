package pr.jay.main.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RestTemplateConfiguration {

    @Bean
    fun restTemplate(): RestTemplateConfiguration{
        val factory = HttpComponentsClientHttpRequestFactory()
        val client = HttpClientBuilder.create()
                .setMaxConnTotal(50)
                .setMaxConnPerRoute(20)
                .build()

        factory.httpClient = client
        factory.setConnectTimeout(3000)
        factory.setReadTimeout(5000)

        return RestTemplate(factory)
    }
}