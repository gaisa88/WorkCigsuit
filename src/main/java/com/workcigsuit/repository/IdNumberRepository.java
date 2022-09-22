package com.workcigsuit.repository;

import com.workcigsuit.model.IdNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface IdNumberRepository extends JpaRepository<IdNumber, Long>{
    @Query("SELECT c from IdNumber c where c.Number = :Number")
    List findAllByName(String Number);
    Optional<IdNumber> findById(int Id);
}
