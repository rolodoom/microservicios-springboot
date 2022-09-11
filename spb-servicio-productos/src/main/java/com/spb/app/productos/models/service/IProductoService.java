package com.spb.app.productos.models.service;

import java.util.List;

import com.spb.app.commons.models.entity.Producto;

public interface IProductoService {

    // CRUD
    // Create and Update
    // - NO ID -> save
    // - WITH ID -> edit
    public Producto save(Producto producto);

    // Read
    // - Read
    public Producto findById(Long Id);

    // - List all
    public List<Producto> findAll();

    // Delete
    public void deleteById(Long id);

}
