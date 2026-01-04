package com.github.contribute;

import com.github.contribute.dto.GithubContributorDto;
import com.github.contribute.service.ContributorService;
import com.github.contribute.service.GithubService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final GithubService githubService;
    private final ContributorService contributorService;

    public DataLoader(GithubService githubService, ContributorService contributorService) {
        this.githubService = githubService;
        this.contributorService = contributorService;
    }

    @Override
    public void run(String... args){
        GithubContributorDto[] contributors = githubService.fetchContributors("spring-projects", "spring-boot");
    }
}
