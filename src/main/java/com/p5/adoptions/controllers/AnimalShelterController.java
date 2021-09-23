package com.p5.adoptions.controllers;


import com.p5.adoptions.repository.shelters.AnimalShelter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/shelters")
public class AnimalShelterController {
    //responsabil pt recuperarea datelor ..
    public AnimalShelterController(Ani)


    //trebuie sa cream metode prin cale sa exetuam operarii de CRUD

    //GetMapping , pt read mereu get, pt create= post, update=put/patch, (put=intentia este de a modifica intregul obiect,
    // patch=intentia de a modifica doar anumite proprietati ale acestui obiect), delete=
    //put, get = verbe
    @GetMapping()
    public ResponseEntity<List<AnimalShelter>> getShelters(){
        return ResponseEntity.ok();
    }


}
