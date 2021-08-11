package com.p5.adoptions.repository.animal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//fiecare entitate trebuie sa aiba un repository care trb sa fie o interfata
@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    //stie automat sa faca interogarea de ... dupa nume
    Optional<Animal> findByName(String name);
}
