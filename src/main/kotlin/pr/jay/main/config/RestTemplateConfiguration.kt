package pr.jay.main.config

import org.apache.hc.client5.http.impl.classic.HttpClientBuilder
import org.apache.http.impl.client.HttpClientBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class RestTemplateConfiguration {

    @Bean
    fun restTemplate() : RestTemplate {
        val client = HttpClientBuilder.create()
                .build()

        return restTemplate();
    }
}