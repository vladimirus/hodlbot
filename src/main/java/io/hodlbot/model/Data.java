
package io.hodlbot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;

@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
    @JsonProperty("modhash")
    public String modhash;
    @JsonProperty("whitelist_status")
    public String whitelistStatus;
    @JsonProperty("children")
    public Collection<Child> children = new ArrayList<>();
    @JsonProperty("after")
    public String after;
    @JsonProperty("before")
    public String before;
}
