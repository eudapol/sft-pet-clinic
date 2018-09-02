package guru.springframework.sftpetclinic.services;

import java.util.Set;

public interface CrudService<T,ID> {
	
	T findById(ID id);
	T save(T T);
	Set<T> findAll();
	void delete(T object);
	void deleteById(ID id);
}
