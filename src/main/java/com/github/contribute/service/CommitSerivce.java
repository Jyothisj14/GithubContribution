package com.github.contribute.service;

import com.github.contribute.model.Commit;
import com.github.contribute.repository.CommitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommitSerivce {

    public final CommitRepository commitRepository;

    public CommitSerivce(CommitRepository commitRepository){
        this.commitRepository = commitRepository;
    }

    public Commit saveCommit(Commit commit){
        return commitRepository.save(commit);
    }

    public List<Commit> getCommitsByContributor(Commit commit){
        return commitRepository.findByContributorId(contributorId);
    }
}
