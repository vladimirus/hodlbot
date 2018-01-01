
package io.hodlbot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Child {
    @JsonProperty("kind")
    public String kind;
    @JsonProperty("data")
    public Data_ data;
}
