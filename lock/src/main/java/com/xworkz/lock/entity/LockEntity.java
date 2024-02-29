package com.xworkz.lock.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "lock_info")
@NoArgsConstructor
@RequiredArgsConstructor
@NamedQuery(name = "deleteByMaterial",query = "delete from LockEntity locker where locker.material=:mats")
@NamedQuery(name = "updateKeyTypeByFuntionallity",query = "update LockEntity locker set locker.keyType=:key where locker.functionality=:fun")
@NamedQuery(name = "findByMaterial",query = "select locker from LockEntity locker where locker.material=:mat")
@NamedQuery(name = "findAll",query = "select locker from LockEntity locker")
@NamedQuery(name = "findAllByKeyType",query = "select locker from LockEntity locker where locker.keyType=:keys")
public class LockEntity {
    @Id
    @Column(name = "l_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "l_keyType")
    @NonNull
    private String keyType;

    @Column(name = "l_securityLevel")
    @NonNull
    private Boolean securityLevel;

    @Column(name = "l_functionality")
    @NonNull
    private String functionality;

    @Column(name = "l_installationType")
    @NonNull
    private String installationType;

    @Column(name = "l_material")
    @NonNull
    private String material;
}
