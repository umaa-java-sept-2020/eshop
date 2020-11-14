package org.inventory.commons.dao;

import java.util.List;

public interface IDataModelDao<T, I> {

    public T insert(T model);

    public T update(T model, I id);

    public List<T> findAll();

    public T findById(I id);

    public I deleteById(I id);

}
