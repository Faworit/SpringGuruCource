package com.springframework.pets;

import org.springframework.stereotype.Service;

//@Service  //comment this annotation, because refactor to configuration class guru.springframework.sfgdi.config;
public class PetServiceFactory {

    public PetService getPetService(String petType) {

        switch (petType) {
            case "dog":
                return new DogPetService();

            case "cat":
                return new CatPetService();

            default:
                return new DogPetService();
        }

    }
}
