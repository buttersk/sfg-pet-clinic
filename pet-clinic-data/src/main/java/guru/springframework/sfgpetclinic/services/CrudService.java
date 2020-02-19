package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by Ken Butters on 2/18/2020
 */

public interface CrudService<T, ID>{
    Set<T> findAll();
    T findByID(ID id);
    T save(T object);
    void delete(T object);
    void deleteById(ID id);
}
