package com.croot.graphql.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name="MEMBER")
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MEMBER_ID")
    private Integer id;
    @Column(name = "MEMBER_NAME")
    private String name;
    @Column(name = "MEMBER_AGE")
    private Integer age;
}
