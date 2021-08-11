package com.p5.adoptions.repository.animal;


import javax.persistence.*;

//Sintaxa de mostenire
//Optiunea 1 - in clasa de baza punem adnotarea @MappedSuperClass (in acest caz, clasa de baza nu mai e o entitate,
// ci este o superClasa)

//Optiunea 2 - definim clasa de baza  ca entitate si punem adnotarea @Inheritance (aceasta clasa este folosita mostenire si putem folosi
// diferite strategii care arata modul in care se vor crea tabelele in tb clasele care mostenesc)
//@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//Only if we use Single_Table
//@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)




//fiecare entitate se va mapa in spate in database intr-un tabel
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Animal {

    //Id ul din baza de date
    @Id
    //Sa fie autoincrementat, sa spunem ce strategie sa foloseasca pentru a incrementa cheia primara
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String photo;

    //Field used in discriminator logic CAT ir DOG
    //private String type; //OP2

    public String getName() {
        return name;
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public Animal setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Animal setId(Integer id) {
        this.id = id;
        return this;
    }
}
