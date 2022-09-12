package com.spb.app.item.models.service;

import java.util.List;

import com.spb.app.commons.models.entity.Producto;
import com.spb.app.item.models.Item;

public interface ItemService {

    public List<Item> findAll();

    public Item findById(Long id, Integer cantidad);

    public Producto save(Producto producto);

    public Producto update(Producto producto, Long id);

    public void delete(Long id);
}
