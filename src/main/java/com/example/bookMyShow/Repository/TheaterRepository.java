package com.example.bookMyShow.Repository;

import com.example.bookMyShow.Model.TheaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TheaterRepository extends CrudRepository<TheaterEntity,Integer> {
    TheaterEntity findById(int id);
}
