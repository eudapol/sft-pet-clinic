package guru.springframework.sftpetclinic.services;

import guru.springframework.sftpetclinic.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long>{
	Vet findById(Long id);
	Vet save(Vet Vet);
	Set<Vet> findAll();
}
