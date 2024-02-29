package com.xworkz.temple.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "temple")
@NamedQuery(name = "findAllByLocation",query = "select temple from TempleEntity temple where temple.location=:tl")
@NamedQuery(name = "findAllByEntryFeeGreaterThan",query = "select temple from TempleEntity temple where temple.entryFee>:te")
@NamedQuery(name = "findAllByEntryFeeBetween",query = "select temple from TempleEntity temple where temple.entryFee BETWEEN:startFee AND:endFee")
@NamedQuery(name = "findAllByInagrudatedDateGreaterThan",query = "select temple from TempleEntity temple where temple.inaguratedDate>:idate")
@NamedQuery(name = "findAllByMainGodAndLocation",query = "select temple from TempleEntity temple where temple.mainGod=:mGod AND temple.location=:loc")
@NamedQuery(name="findById",query = "select temple from TempleEntity temple where temple.id=:tid")
@NamedQuery(name = "findByIdAndMainGod",query ="select temple from TempleEntity temple where temple.id=:tid AND temple.mainGod=:god")
@NamedQuery(name = "findTotal",query = "select SUM(vipEntry) AS total from TempleEntity")
@NamedQuery(name = "findTempleByMaxEntryFee",query = "select tp from TempleEntity tp where tp.entryFee=(SELECT MAX(te.entryFee) FROM TempleEntity te)")
@NamedQuery(name = "updateLocationByName",query = "update TempleEntity set location=Chikkmangalore where name=Chennakeshava temple=:temp")
public class TempleEntity {
   @NonNull
    @Id
    @Column(name = "t_id")
    private int id;
    @Column(name = "t_name")
    @NonNull
    private String name;
    @Column(name = "t_location")
    @NonNull
    private String location;
    @Column(name = "t_entryFee")
    @NonNull
    private Double entryFee;
    @Column(name = "t_vipEntry")
    @NonNull
    private Double vipEntry;
    @Column(name = "t_endFee")
    @NonNull
    private Double endFee;
    @Column(name = "t_inaguratedDate")
    @NonNull
    private LocalDate inaguratedDate;
    @Column(name = "t_mainGod")
    @NonNull
    private String mainGod;
    @Column(name = "t_dimension")
    @NonNull
    private int dimension;

}
