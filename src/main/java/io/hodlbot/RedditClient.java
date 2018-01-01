package io.hodlbot;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import io.hodlbot.model.RedditPost;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@FeignClient(name = "reddit", url = "https://www.reddit.com/", configuration = FeignConfig.class)
public interface RedditClient {

    @RequestMapping(value = "r/{subreddit}/comments/{articleId}/api.json", method = GET)
    Collection<RedditPost> getComments(
            @PathVariable("subreddit") String subreddit,
            @PathVariable("articleId") String articleId
    );
}
