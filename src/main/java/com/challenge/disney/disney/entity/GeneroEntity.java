package com.challenge.disney.disney.entity;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "gender")
@Getter
@Setter
public class GeneroEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String image;

    //private List<PeliculaEntity> genders = new ArrayList<>();



}

