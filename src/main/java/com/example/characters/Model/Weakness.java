//package com.example.characters.Model;
//import jakarta.persistence.*;
//import java.util.List;
//
//@Entity
//public class Weakness {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int  weakness_id;
//    private String name;
//
//    @ManyToMany(mappedBy = "weaknesses")
//    private List<Characters> characters;
//
//    //getter y setters
//
//    //getter
//    public int getWeakness_id(){
//        return weakness_id;
//    }
//
//    public void setWeakness_id(int weakness_id) {
//        this.weakness_id = weakness_id;
//    }
//
//    public String getNameWeakness() {
//        return name;
//    }
//
//    public void setNameWeakness(String name){
//        this.name = name;
//    }
//
//}
