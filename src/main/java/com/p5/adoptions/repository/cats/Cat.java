package com.p5.adoptions.repository.cats;

import com.p5.adoptions.repository.animal.Animal;
import com.p5.adoptions.repository.shelters.AnimalShelter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//sintaxa de mostenire - vezi Animal
@Entity
public class Cat extends Animal {
//bidirectional - vezi relatia din AnimalShelter bidirectional
    //@ManyToOne
    //@JoinColumn(name= "shelder_id")
    //private AnimalShelter shelter;

}
