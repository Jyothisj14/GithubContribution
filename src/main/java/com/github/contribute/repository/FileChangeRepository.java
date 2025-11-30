package com.github.contribute.repository;

import com.github.contribute.model.Commit;
import com.github.contribute.model.FileChange;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FileChangeRepository extends JpaRepository<FileChange, Long> {
    List<FileChange> findByCommitId(Commit commitId);
}
