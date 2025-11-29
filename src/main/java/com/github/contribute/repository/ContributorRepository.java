package com.github.contribute.repository;

import com.github.contribute.model.Contributor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContributorRepository extends JpaRepository<Contributor, Long> {

    void findByUsername(String username);
    //Have to check if the contributor exist
    //fetch contributor by username
    //save and update automatically
}
