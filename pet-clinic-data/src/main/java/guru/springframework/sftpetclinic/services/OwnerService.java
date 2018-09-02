package guru.springframework.sftpetclinic.services;

import java.util.Set;

import guru.springframework.sftpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	Owner findByLastName(String lastName);
	Owner findById(Long id);
	Owner save(Owner owner);
	Set<Owner> findAll();
}
