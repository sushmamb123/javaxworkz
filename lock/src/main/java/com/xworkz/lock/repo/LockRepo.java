package com.xworkz.lock.repo;

import com.xworkz.lock.entity.LockEntity;

import java.util.Collections;
import java.util.List;

public interface LockRepo {
    Integer save(LockEntity entity);
    default void saveAll(List<LockEntity> entities){

    }
    default List<LockEntity> deleteByMaterial(String material){
        return Collections.emptyList();
    }
    default List<LockEntity> updateKeyTypeByFuntionallity(String keyType,String functionality){
        return Collections.emptyList();
    }
    default List<LockEntity> findByMaterial(String material){
        return Collections.emptyList();
    }
    default List<LockEntity> findAll(){
        return Collections.emptyList();
    }
    default List<LockEntity> findAllByKeyType(String keyTypes){
        return Collections.emptyList();
    }



}
