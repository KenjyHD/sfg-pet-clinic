package kenjy.sfgpetclinic.repositories;

import kenjy.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
