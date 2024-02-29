package com.xworkz.january.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data

@Entity
@Table(name = "super_hero")

public class SuperHeroEntity {
    @Id
    @Column(name = "s_id")

    private int id;
    @Column(name = "s_name")
    private String name;
    @Column(name = "s_fiction_name")
    private String frictionalName;
    @Column(name = "s_country")
    private String country;
    @Column(name = "s_weakness")
    private String weakness;

}
