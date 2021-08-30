package com.tony.fpl.model;

import lombok.Getter;
import lombok.Setter;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table
@Setter
@Getter
public class Manager implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    @NotNull
    private String firstName;

    @Column
    @NotNull
    private String lastName;

    @Column
    @NotNull
    private String teamName;

    @Column
    @NotNull
    private String favTeam;

    @Column
    @NotNull
    private String country;

    @Column
    @NotNull
    private long points;

    @JsonbTransient
    @Column(name = "join_time", updatable = false)
    private LocalDateTime joinTime = LocalDateTime.now();

}

