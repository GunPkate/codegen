package com.example.codgen.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.codgen.api.PetApi;
import com.example.codgen.model.Pet;

import java.util.List;

@RestController
public class PetController  implements PetApi{

    @Override
    public ResponseEntity<List<Pet>> findPetsByTags(List<String> tags) {
        var dog = new Pet();
        dog.name("Dog");
        return new ResponseEntity<>(List.of(), HttpStatus.OK);
    }
}
