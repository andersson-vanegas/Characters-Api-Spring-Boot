package com.example.characters.Repository;

import com.example.characters.Model.Planets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlanetsRepository extends  JpaRepository <Planets, Long> {
    Optional<Planets> findByPlanetId(Long planetId);

}
