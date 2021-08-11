package com.p5.adoptions.repository.shelters;


import com.p5.adoptions.repository.cats.Cat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AnimalShelter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
  //  @Column(name = "nume", unique = true) //adaugam restrictii pe db
    private String name;

    //relatii

    //unidirectional OneToMany
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name= "shelter_id")
    private List<Cat> cats= new ArrayList<>();



    // @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    //pentru cheia straina, de ex avem cheie straina din tabelul cat pt acest tabel
    //adica specificam relatia doar intr-un singur tabel, nu este necesar sa specificam si in tabelul cat
   // @JoinColumn(name="cat_id")
   // private Cat cat;

    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "shelter" )
    // mappedBY - relatie bidirectionala adica din shelter avem o relatie catre pisici si vice versa
    //private List<Cat> cats = new ArrayList<>();
    //o lista de pisici mapate de shelter u din pisica




   // @ManyToMany
    // este necesar un tabel de legatura care sa contina cheile straine
    //@JoinTable(name = "shelter_cats",
               // joinColumns = @JoinColumn(name= "shelter_id", referencedColumnName = "id"),
                // inverseJoinColumns = @JoinColumn (name= "cat_id", referencedColumnName = "id"))
    //private List<Cat> catss= new ArrayList<>();


    public Integer getId() {
        return id;
    }

    public AnimalShelter setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AnimalShelter setName(String name) {
        this.name = name;
        return this;
    }
}
