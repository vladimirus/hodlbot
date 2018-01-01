
package io.hodlbot.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@ToString
@JsonInclude(Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data_ {
    @JsonProperty("domain")
    public String domain;
    @JsonProperty("approved_at_utc")
    public String approvedAtUtc;
    @JsonProperty("mod_reason_by")
    public String modReasonBy;
    @JsonProperty("banned_by")
    public String bannedBy;
    @JsonProperty("subreddit_id")
    public String subredditId;
    @JsonProperty("thumbnail_width")
    public String thumbnailWidth;
    @JsonProperty("subreddit")
    public String subreddit;
    @JsonProperty("selftext_html")
    public String selftextHtml;
    @JsonProperty("selftext")
    public String selftext;
    @JsonProperty("likes")
    public String likes;
    @JsonProperty("suggested_sort")
    public String suggestedSort;
    @JsonProperty("mod_note")
    public String modNote;
    @JsonProperty("user_reports")
    public Collection<String> userReports = new ArrayList<>();
    @JsonProperty("secure_media")
    public String secureMedia;
    @JsonProperty("is_reddit_media_domain")
    public boolean isRedditMediaDomain;
    @JsonProperty("link_flair_text")
    public String linkFlairText;
    @JsonProperty("id")
    public String id;
    @JsonProperty("banned_at_utc")
    public String bannedAtUtc;
    @JsonProperty("mod_reason_title")
    public String modReasonTitle;
    @JsonProperty("view_count")
    public String viewCount;
    @JsonProperty("archived")
    public boolean archived;
    @JsonProperty("clicked")
    public boolean clicked;
    @JsonProperty("report_reasons")
    public String reportReasons;
    @JsonProperty("author")
    public String author;
    @JsonProperty("num_crossposts")
    public int numCrossposts;
    @JsonProperty("saved")
    public boolean saved;
    @JsonProperty("can_mod_post")
    public boolean canModPost;
    @JsonProperty("is_crosspostable")
    public boolean isCrosspostable;
    @JsonProperty("pinned")
    public boolean pinned;
    @JsonProperty("score")
    public int score;
    @JsonProperty("approved_by")
    public String approvedBy;
    @JsonProperty("over_18")
    public boolean over18;
    @JsonProperty("removal_reason")
    public String removalReason;
    @JsonProperty("hidden")
    public boolean hidden;
    @JsonProperty("num_comments")
    public int numComments;
    @JsonProperty("thumbnail")
    public String thumbnail;
    @JsonProperty("hide_score")
    public boolean hideScore;
    @JsonProperty("edited")
    public boolean edited;
    @JsonProperty("link_flair_css_class")
    public String linkFlairCssClass;
    @JsonProperty("author_flair_css_class")
    public String authorFlairCssClass;
    @JsonProperty("contest_mode")
    public boolean contestMode;
    @JsonProperty("gilded")
    public int gilded;
    @JsonProperty("locked")
    public boolean locked;
    @JsonProperty("downs")
    public int downs;
    @JsonProperty("brand_safe")
    public boolean brandSafe;
    @JsonProperty("secure_media_embed")
    public SecureMediaEmbed secureMediaEmbed;
    @JsonProperty("media_embed")
    public MediaEmbed mediaEmbed;
    @JsonProperty("can_gild")
    public boolean canGild;
    @JsonProperty("thumbnail_height")
    public String thumbnailHeight;
    @JsonProperty("parent_whitelist_status")
    public String parentWhitelistStatus;
    @JsonProperty("name")
    public String name;
    @JsonProperty("spoiler")
    public boolean spoiler;
    @JsonProperty("permalink")
    public String permalink;
    @JsonProperty("subreddit_type")
    public String subredditType;
    @JsonProperty("whitelist_status")
    public String whitelistStatus;
    @JsonProperty("stickied")
    public boolean stickied;
    @JsonProperty("created")
    public double created;
    @JsonProperty("url")
    public String url;
    @JsonProperty("author_flair_text")
    public String authorFlairText;
    @JsonProperty("quarantine")
    public boolean quarantine;
    @JsonProperty("title")
    public String title;
    @JsonProperty("created_utc")
    public double createdUtc;
    @JsonProperty("subreddit_name_prefixed")
    public String subredditNamePrefixed;
    @JsonProperty("distinguished")
    public String distinguished;
    @JsonProperty("media")
    public String media;
    @JsonProperty("upvote_ratio")
    public double upvoteRatio;
    @JsonProperty("mod_reports")
    public Collection<String> modReports = new ArrayList<>();
    @JsonProperty("is_self")
    public boolean isSelf;
    @JsonProperty("visited")
    public boolean visited;
    @JsonProperty("num_reports")
    public String numReports;
    @JsonProperty("is_video")
    public boolean isVideo;
    @JsonProperty("ups")
    public int ups;
    @JsonProperty("link_id")
    public String linkId;

    @JsonProperty("replies")
    public Collection<RedditPost> replies = new ArrayList<>();

    @JsonProperty("parent_id")
    public String parentId;
    @JsonProperty("body")
    public String body; // here
    @JsonProperty("collapsed")
    public boolean collapsed;
    @JsonProperty("is_submitter")
    public boolean isSubmitter;
    @JsonProperty("collapsed_reason")
    public String collapsedReason;
    @JsonProperty("body_html")
    public String bodyHtml;
    @JsonProperty("score_hidden")
    public boolean scoreHidden;
    @JsonProperty("controversiality")
    public int controversiality;
    @JsonProperty("depth")
    public int depth;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
