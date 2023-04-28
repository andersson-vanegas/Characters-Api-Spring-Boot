package com.example.characters.Model;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name = "characters")
public class Characters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "character_id")
    private Long characterId;
    @Column(nullable = true)
    private String name;
    @Column(nullable = false)
    private String alias;
    @Column(nullable = false)
    private Date Date_of_birth;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "planet_id")
    private  Planets planet_id;
    @Column(nullable = true)
    private Date Date_of_dead;
    @Column(nullable = false)
    private Boolean is_student;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "character_type_id")
    private  CharacterType characterType;
    @Column(nullable = false)
    private Boolean is_guardians;

//    @ManyToMany
//           @JoinTable(
//            name = "characters_skills",
//           joinColumns = @JoinColumn(name = "character_id"),
//            inverseJoinColumns =  @JoinColumn(name = "skills_id"))
//   private List<Skills> skills;
//
//  @ManyToMany
//           @JoinTable(
//            name = "characters_weaknesses",
//         joinColumns = @JoinColumn(name = "character_id"),
//           inverseJoinColumns =  @JoinColumn(name = "weakness_id"))
//   private List<Weakness> weaknesses;


    // getters and setters

    //getters


    public Long getCharacterId() {
        return characterId;
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }

    public Date getDate_of_birth() {
        return Date_of_birth;
    }

    public Planets getPlanet_id() {
        return planet_id;
    }

    public Date getDate_of_dead() {
        return Date_of_dead;
    }

    public Boolean getIs_student() {
        return is_student;
    }

    public CharacterType getCharacterType() {
        return characterType;
    }

    public Boolean getIs_guardians() {
        return is_guardians;
    }

    //setters


    public void setCharacterId(Long characterId) {
        this.characterId = characterId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setDate_of_birth(Date date_of_birth) {
        Date_of_birth = date_of_birth;
    }

    public void setPlanet_id(Planets planet_id) {
        this.planet_id = planet_id;
    }

    public void setDate_of_dead(Date date_of_dead) {
        Date_of_dead = date_of_dead;
    }

    public void setIs_student(Boolean is_student) {
        this.is_student = is_student;
    }

    public void setCharacterType(CharacterType characterType) {
        this.characterType = characterType;
    }

    public void setIs_guardians(Boolean is_guardians) {
        this.is_guardians = is_guardians;
    }


}
