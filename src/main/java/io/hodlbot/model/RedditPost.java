
package io.hodlbot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class RedditPost {
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("data")
    private Data data;
}
