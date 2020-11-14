package org.inventory.item.dao;


import org.inventory.commons.model.Gallery;
import org.inventory.commons.model.GalleryImage;

import java.util.List;

public interface IGalleryDao extends IDataModelDao<Gallery, Integer> {

    Gallery insertGalleryImage(Integer galleryId, List<GalleryImage> galleryImage);

    Gallery removeGalleryImage(Integer galleryId, List<Integer> galleryImageIds);

    Gallery updateGalleryImage(Integer galleryId, List<GalleryImage> galleryImage);
}
