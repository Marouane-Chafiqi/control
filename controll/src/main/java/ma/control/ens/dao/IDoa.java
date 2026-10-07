package ma.control.ens.dao;

import java.util.List;

public interface IDoa<T>  {
    boolean create(T o);
    boolean delete(T o);
    boolean update(T o);
    T findById(long id);
    List<T> findAll();
}
