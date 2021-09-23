package com.p5.adoptions.service;

import com.p5.adoptions.repository.shelters.AnimalShelterRepository;
import org.springframework.stereotype.Service;

@Service
public class AnimalShelterServices {

    private  final AnimalShelterRepository animalShelterRepository;

    public  AnimalShelterServices(AnimalShelterRepository animalShelterRepository)
    {
        this.animalShelterRepository = animalShelterRepository;
    }
}
