package com.xworkz.fertilizer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "email")
public class EmailEntity {
    @Id
    @Column(name = "e_id")
    private int id;
    @Column(name = "e_address")
    private String address;
    @Column(name = "e_from")
    private String from;
    @Column(name = "e_to")
    private String to;
    @Column(name = "e_subject")
    private String subject;
    @Column(name = "e_cc")
    private String cc;
    @Column(name = "e_bcc")
    private String bcc;
    @Column(name = "e_body")
    private String body;
    @Column(name = "e_sentDate")
    private LocalDate sentDate;
    @Column(name = "e_success")
    private boolean success;




}
