package com.github.contribute.service;

import org.springframework.stereotype.Service;

@Service
public class GithubService {

    public final ContributorService contributorService;

    public final CommitSerivce commitSerivce;

    public final FileChangeService fileChangeService;

    public GithubService(ContributorService contributorService, CommitSerivce commitSerivce, FileChangeService fileChangeService) {
        this.contributorService = contributorService;
        this.commitSerivce = commitSerivce;
        this.fileChangeService = fileChangeService;
    }

    public void fetchAndStoreRepoData(String owner, String repo)
    {

    }
}
