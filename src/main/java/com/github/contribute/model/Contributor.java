package com.github.contribute.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "contributors")
@Data
public class Contributor {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String username;

    private Integer contributions;

    String avatarUrl;

    @OneToMany(mappedBy = "contributor")
    private List<Commit> commits;

}
