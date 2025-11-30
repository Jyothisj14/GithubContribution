package com.github.contribute.repository;

import com.github.contribute.model.Contributor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContributorRepository extends JpaRepository<Contributor, Long> {

    Optional<Contributor> findByUsername(String username);
}
