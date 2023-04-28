package com.example.characters.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.characters.Model.Characters;
import java.util.Optional;


@Repository
public interface CharacterRepository  extends JpaRepository <Characters, Long > {

    Optional<Characters> findByCharacterId(Long characterId);
}
