package io.hodlbot;

import io.hodlbot.model.RedditPost;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Collection;

@Slf4j
@EnableFeignClients
@SpringBootApplication
public class HodlbotApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(HodlbotApplication.class, args);

        Collection<RedditPost> response = context.getBean(RedditClient.class).getComments("CryptoCurrency", "7mu8rz");
        System.out.println(response);
    }

}
