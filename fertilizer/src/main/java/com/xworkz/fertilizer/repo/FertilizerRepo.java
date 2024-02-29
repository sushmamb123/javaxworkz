package com.xworkz.fertilizer.repo;

import com.xworkz.fertilizer.entity.FertilizerEntity;

import java.util.Collections;
import java.util.List;

public interface FertilizerRepo {
    Integer save(FertilizerEntity fertilizerEntity);
    default void saveAll(List<FertilizerEntity> entities){


    }
    default List<FertilizerEntity> findAllByQuantity(int quantity){
        return  Collections.emptyList();

    }
}
