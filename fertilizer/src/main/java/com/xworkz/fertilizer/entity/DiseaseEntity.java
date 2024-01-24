package com.xworkz.fertilizer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "patient")
public class DiseaseEntity {
    @Id
    @Column(name = "p_id")
    private int id;
    @Column(name = "p_name")
    private String name;
    @Column(name = "p_location")
    private String location;
    @Column(name = "p_pincode")
    private int pincode;
    @Column(name = "p_hospitalName")
    private String hospitalName;
    @Column(name = "p_state")
    private String state;
}
