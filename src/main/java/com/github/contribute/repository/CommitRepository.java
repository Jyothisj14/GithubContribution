package com.github.contribute.repository;

import com.github.contribute.model.Commit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommitRepository extends JpaRepository<Commit, Long> {
     List<Commit> findByContributorId(Long contributorId);
}
