package com.github.contribute.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "contributors")
@Data
public class FileChange {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String username;

    private Integer contributions;

    String avatarUrl;
}
