package guru.springframework.sftpetclinic.services.map;

import java.util.Set;

import guru.springframework.sftpetclinic.model.Owner;
import guru.springframework.sftpetclinic.services.CrudService;


public class OwnerServiceMap  extends AbstractMapService<Owner, Long> implements CrudService<Owner,Long>{

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(), object);
	}

	@Override
	public Set<Owner> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
		
	}

	

}
