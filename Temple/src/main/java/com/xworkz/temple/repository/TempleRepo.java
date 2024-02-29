package com.xworkz.temple.repository;

import com.xworkz.temple.entity.TempleEntity;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public interface TempleRepo {
    Integer save(TempleEntity entity);
    default void saveAll(List<TempleEntity> entities){

    }
    default List<TempleEntity> findAllByLocation(String location){
        return Collections.emptyList();
    }
    default List<TempleEntity> findAllByEntryFeeGreaterThan(double entryFee){

        return Collections.emptyList();
    }
    default List<TempleEntity> findAllByEntryFeeBetween(double startFee,double endFee){

        return Collections.emptyList();
    }
    default List<TempleEntity> findAllByInagrudatedDateGreaterThan(LocalDate inaguratedDate){

        return Collections.emptyList();
    }
    default List<TempleEntity> findAllByMainGodAndLocation(String mainGod,String location){

        return Collections.emptyList();
    }
    default List<TempleEntity> findById(int id){

        return Collections.emptyList();
    }

    default TempleEntity findByIdAndMainGod(int id, String mainGod) {
        return null;
    }
   /* default Long findTotal(){
        return null;
    }*/
    default  TempleEntity findTempleByMaxEntryFee(){
        return null;
    }
    void updateLocationByName(String location,String name);





}
