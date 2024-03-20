package com.example.openapi.pet.controller;

import com.example.openapi.api.PetApi;
import com.example.openapi.model.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController implements PetApi {

  @Override
  public ResponseEntity<Pet> getPetById(Long petId) {
    return PetApi.super.getPetById(petId);
  }
}
