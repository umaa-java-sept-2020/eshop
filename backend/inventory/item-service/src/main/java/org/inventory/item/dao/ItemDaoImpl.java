package org.inventory.item.dao;

import org.inventory.commons.model.Item;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemDaoImpl implements IItemDao {

    private static final String INSERT_ITEM = "INSERT INTO TBL_ITEM() VALUES(?,?)";
    @Override
    public Item insert(Item model) {
        return null;
    }

    @Override
    public Item update(Item model, Integer id) {
        return null;
    }

    @Override
    public List<Item> findAll() {
        return null;
    }

    @Override
    public Item findById(Integer id) {
        return null;
    }

    @Override
    public Integer deleteById(Integer id) {
        // delete association
        // delete item
        return null;
    }

    @Override
    public Item insertGallery(Integer itemId, Integer galleryId) {
        return null;
    }

    @Override
    public Item updateGallery(Integer itemId, Integer galleryId) {
        return null;
    }

    @Override
    public Item deleteGallery(Integer itemId, Integer galleryId) {
        return null;
    }
}
