package com.github.contribute.controller;

import com.github.contribute.model.Commit;
import com.github.contribute.model.Contributor;
import com.github.contribute.model.FileChange;
import com.github.contribute.service.CommitSerivce;
import com.github.contribute.service.ContributorService;
import com.github.contribute.service.FileChangeService;
import com.github.contribute.service.GithubService;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RepoController {

    private final GithubService githubService;
    private final ContributorService contributorService;
    private final CommitSerivce  commitSerivce;
    private final FileChangeService  fileChangeService;


    public RepoController(GithubService githubService, ContributorService contributorService, CommitSerivce commitSerivce, FileChangeService fileChangeService) {
        this.githubService = githubService;
        this.contributorService = contributorService;
        this.commitSerivce = commitSerivce;
        this.fileChangeService = fileChangeService;
    }

    @PostMapping("/repo/fetch/{owner}/{repo}")
    public String fetchRepoData(@PathVariable String owner, @PathVariable String repo) {
        githubService.fetchAndStoreRepoData(owner, repo);
        return "Repository data fetch triggered successfully";
    }

    @GetMapping("/contributors")
    public List<Contributor> fetchContributors() {
        return contributorService.getAllContributors();
    }

    @GetMapping("/contributors/{contributorId}/commits")
    public List<Commit> getCommitsByContributor(@PathVariable Long contributorId) {
        return commitSerivce.getCommitsByContributor(contributorId);
    }

    @GetMapping("/commits/{commitId}/files")
    public List<FileChange> getFilesByCommit(@PathVariable String commitId) {
        return fileChangeService.getByCommitId(commitId);
    }
}
