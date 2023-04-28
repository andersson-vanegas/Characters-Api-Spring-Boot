//package com.example.characters.Model;
//import jakarta.persistence.*;
//import jakarta.persistence.Entity;
//import java.util.List;
//
//@Entity
//public class Skills {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private  Long Skill_id;
//    private String name;
//
//    @ManyToMany(mappedBy = "skills")
//    private List<Characters> characters;
//
//
//    public Long getSkill_id() {
//        return Skill_id;
//    }
//
//    public void setSkill_id(Long skill_id) {
//        Skill_id = skill_id;
//    }
//
//    public String getNameSkills() {
//        return name;
//    }
//
//    public void setNameSkills(String name) {
//        this.name = name;
//    }
//}
