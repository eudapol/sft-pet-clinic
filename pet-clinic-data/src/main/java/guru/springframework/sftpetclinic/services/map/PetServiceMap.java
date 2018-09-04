package guru.springframework.sftpetclinic.services.map;


import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sftpetclinic.model.Pet;
import guru.springframework.sftpetclinic.services.CrudService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet,Long>{

	@Override
	public Pet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(), object);
	}

	@Override
	public Set<Pet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public void delete(Pet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}



}
