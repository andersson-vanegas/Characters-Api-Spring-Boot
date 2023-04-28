package com.example.characters.Controller;
import com.example.characters.Model.Characters;
import com.example.characters.Model.Planets;
import com.example.characters.Repository.CharacterRepository;
import com.example.characters.Repository.PlanetsRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/api/")
public class CharacterController {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(CharacterController.class);
    @Autowired
    private  CharacterRepository characterRepository;

    @Autowired
    private PlanetsRepository planetsRepository;




//    @GetMapping
//    public ResponseEntity<Page<Characters>> getAllCharacters (
//            @RequestParam(defaultValue = "0") int page ,
//            @RequestParam(defaultValue = "10") int size){
//
//             Pageable pageable = PageRequest.of(page, size);
//             Page<Characters> characterPage = characterRepository.findAll(pageable);
//
//                return ResponseEntity.ok(characterPage);
//        }

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello, world!";
    }

    @GetMapping(value = "/character/{characterId}")
        public ResponseEntity<Characters> getCharactersById(@PathVariable Long characterId){
       Optional <Characters> optionalCharacters = characterRepository.findByCharacterId(characterId);
       if (optionalCharacters.isPresent()){
           Characters characters = optionalCharacters.get();
           return new ResponseEntity<>(characters, HttpStatus.OK );
       }
      else {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
 }
//    @GetMapping(value = "/character/{CharacterId}")
//    public Characters find(@PathVariable Long characterId){
//        logger.debug("obteniendo id", characterId);
//        return characterRepository.findByCharacterId(characterId);
//    }
   @GetMapping(value = "/planet/{planetId}")
    public  ResponseEntity<Planets> getPlanetById(@PathVariable Long planetId) {
       Optional<Planets> optionalPlanets = planetsRepository.findByPlanetId(planetId);
       if (optionalPlanets.isPresent()) {
           Planets planet = optionalPlanets.get();
           return new ResponseEntity<>(planet, HttpStatus.OK);
       } else {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
   }
//
//    @PostMapping(value ="/add")
//    public ResponseEntity<Characters> createCharacter(@RequestBody Characters characters){
//        Characters savedCharacter = characterRepository.save(characters);
//        return new ResponseEntity<Characters>(savedCharacter, HttpStatus.OK);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Characters> updateCharacters (@PathVariable Long character_id, @RequestBody Characters characters ){
//        Optional<Characters> optionalCharacter = characterRepository.findById(character_id);
//
//        if (optionalCharacter.isPresent()){
//            Characters updateCharacters = optionalCharacter.get();
//
//            updateCharacters.setName(characters.getName());
//            updateCharacters.setAlias(characters.getAlias());
//            updateCharacters.setDate_of_birth(characters.getDate_of_birth());
//            updateCharacters.setPlanet_id(characters.getPlanet_id());
//            updateCharacters.setDate_of_dead(characters.getDate_of_dead());
//            updateCharacters.setIs_student(characters.getIs_student());
//            updateCharacters.setCharacterType(characters.getCharacterType());
//            updateCharacters.setIs_guardians(characters.getIs_guardians());
//            //updateCharacters.getNameWeakness(characters.getNameWeakness);
//            //updateCharacters.getNameSkills(characters.getNameSkills());
//            characterRepository.save(updateCharacters);
//                return  ResponseEntity.ok(updateCharacters);
//        }
//        else {
//            return  ResponseEntity.notFound().build();
//        }
//    }
//
//    @DeleteMapping("/{character_id}")
//    public ResponseEntity<Void> deleteCharacter(@PathVariable Long character_id) {
//        Optional<Characters> optionalCharacters = characterRepository.findById(character_id);
//                if(optionalCharacters.isPresent()){
//                    characterRepository.deleteById(character_id);
//                    return ResponseEntity.ok().build();
//                }
//                else {
//                    return ResponseEntity.notFound().build();
//                }
//    }

   }
