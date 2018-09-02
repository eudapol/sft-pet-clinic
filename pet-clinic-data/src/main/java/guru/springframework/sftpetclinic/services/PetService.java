package guru.springframework.sftpetclinic.services;

import guru.springframework.sftpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
	Pet findById(Long id);
	Pet save(Pet Pet);
	Set<Pet> findAll();
}
