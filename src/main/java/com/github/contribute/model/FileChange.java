package com.github.contribute.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "file_changes")
@Data
public class FileChange {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    Long id;

    String filename;

    Integer additions;

    Integer deletions;

    Integer changes;

    String status;

    @ManyToOne
    @JoinColumn(name = "commit_id")
    private Commit commit;
}
