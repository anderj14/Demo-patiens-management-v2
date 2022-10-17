package com.example.demopatiensdentins;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatiensRepository extends JpaRepository<Patiens, Long> {

    @Query("SELECT s FROM Patiens s WHERE s.cedula = ?1")
    Optional<Patiens> findPatiensByCedula(Long cedula);
}
