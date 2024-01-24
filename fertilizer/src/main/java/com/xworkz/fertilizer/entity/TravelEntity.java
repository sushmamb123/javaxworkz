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
@Table(name = "travel")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TravelEntity {
    @Id
    @Column(name = "t_id")
    private int id;
    @Column(name = "t_source")
    private String source;
    @Column(name = "t_destination")
    private String destination;
    @Column(name = "t_budget")
    private double budget;
    @Column(name = "t_distance")
    private float distance;
    @Column(name = "t_purpose")
    private String purpose;
    @Column(name = "t_duration")
    private int duration;
    @Column(name = "t_modeType")
    private String modeType;
    @Column(name = "t_date")
    private LocalDate date;
    @Column(name = "t_returnDate")
    private LocalDate returnDate;

}
