package org.inventory.item.dao;


import org.inventory.commons.model.Item;

public interface IItemDao extends IDataModelDao<Item, Integer> {

    public Item insertGallery(Integer itemId, Integer galleryId);
    public Item updateGallery(Integer itemId, Integer galleryId);
    public Item deleteGallery(Integer itemId, Integer galleryId);
}
