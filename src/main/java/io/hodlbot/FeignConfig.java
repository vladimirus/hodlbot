package io.hodlbot;

import static com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Client;
import feign.Feign;
import feign.Feign.Builder;
import feign.slf4j.Slf4jLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public Feign.Builder feignBuilder(Client client) {
        return new Builder()
                .logger(new Slf4jLogger())
                .client(client)
                .requestInterceptor(template -> template.header("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.108 Safari/537.36"));
    }

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        return objectMapper;
    }
}
