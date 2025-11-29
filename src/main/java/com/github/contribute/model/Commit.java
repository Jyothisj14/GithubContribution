package com.github.contribute.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "commits")
@Data
public class Commit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String commitHash;

    String author;

    LocalDateTime commitDate;

    String message;

    Integer filesChangedCount;

    @ManyToOne
    @JoinColumn(name = "contributor_id")
    private Contributor contributor;

    @OneToMany(mappedBy = "commit", cascade = CascadeType.ALL)
    private List<FileChange> fileChanges;

}
