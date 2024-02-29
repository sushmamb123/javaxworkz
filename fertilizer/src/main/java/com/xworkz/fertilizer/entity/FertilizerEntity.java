package com.xworkz.fertilizer.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "fertilizer")
@NamedQuery(name = "findAllByQuantity",query = "select fertility from FertilizerEntity fertility where fertility.quantity=:qt")
public class FertilizerEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "f_id")
    private int id;
    @Column(name = "f_name")
    @NonNull
    private String fertilizerName;
    @Column(name = "f_quantity")
    @NonNull
    private int quantity;
    @Column(name = "f_cost")
    @NonNull
    private double cost;
    @Column(name = "f_manufDate")
    @NonNull
    private LocalDate manufactureDate;
    @Column(name = "f_expiryDate")
    @NonNull
    private LocalDate expiryDate;
}
