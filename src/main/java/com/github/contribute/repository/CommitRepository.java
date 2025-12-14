package com.github.contribute.repository;

import com.github.contribute.model.Commit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommitRepository extends JpaRepository<Commit, Long> {
     List<Commit> findByContributorId(Long contributorId);
}
// I don't really have write the implementation of these interfaces,
// because the spring data JPA autogenertes the implementation during the runtime.
//The spring creates a proxy class in memory and adds the implementation of the methods of JPA repository
/* It works like -->
* findby --> SELECT query
* Username --> column
* value -- > contributorid */
