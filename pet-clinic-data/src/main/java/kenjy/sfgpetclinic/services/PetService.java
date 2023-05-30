package kenjy.sfgpetclinic.services;

import kenjy.sfgpetclinic.model.Pet;
import java.util.Set;

public interface PetService {
    Pet findByLastName(String lastName);

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
