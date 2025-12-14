package com.github.contribute.service;

import com.github.contribute.model.Contributor;
import com.github.contribute.repository.ContributorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContributorService {

    public final ContributorRepository contributorRepository;

    public ContributorService(ContributorRepository contributorRepository) {
        this.contributorRepository = contributorRepository;
    }

    public Contributor saveOrUpdate(Contributor contributor){
        return contributorRepository.save(contributor);
    }

    public List<Contributor> getAllContributors(){
        return contributorRepository.findAll();
    }

    public Optional<Contributor> getByUsername(String username)
    {
        return contributorRepository.findByUsername(username);
    }
}
