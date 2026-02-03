package com.github.contribute.service;

import com.github.contribute.dto.GithubContributorDto;
import com.github.contribute.model.Commit;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GithubService {

    private static final String GITHUB_API_BASE = "https://api.github.com";

    private final RestTemplate restTemplate;
    private final ContributorService contributorService;
    private final CommitSerivce commitSerivce;
    private final FileChangeService fileChangeService;

    public GithubService(RestTemplate restTemplate, ContributorService contributorService, CommitSerivce commitSerivce, FileChangeService fileChangeService) {
        this.restTemplate = restTemplate;
        this.contributorService = contributorService;
        this.commitSerivce = commitSerivce;
        this.fileChangeService = fileChangeService;
    }

    public void fetchAndStoreRepoData(String owner, String repo)
    {
        fetchContributors(owner, repo);
        fetchCommits(owner, repo);
    }

    public GithubContributorDto[] fetchContributors(String owner, String repo) {

        String url = GITHUB_API_BASE + "/repos/" + owner + "/" + repo + "/contributors";

        return restTemplate.getForObject(url, GithubContributorDto[].class);

    }

    private void fetchCommits(String owner, String repo) {

    }

    private void fetchFileChanges(String owner, String repo, Commit  commit, String sha) {
    }
}
