package com.github.contribute.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GithubContributorDto {

    private String login;

    private int contributions;

    @JsonProperty("avatar_url")
    private String avatarUrl;
}
