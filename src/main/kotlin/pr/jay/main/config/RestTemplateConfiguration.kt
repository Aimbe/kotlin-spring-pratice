package pr.jay.main.config

import org.apache.http.impl.client.HttpClientBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RestTemplateConfiguration {

    @Bean
    fun restTemplate() : RestTemplate{
        val client = HttpClientBuilder.create()
                .setMaxConnTotal(50)
                .setMaxConnPerRoute(20)
                .build()


        return restTemplate();
    }
}