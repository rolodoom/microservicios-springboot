package com.spb.app.item.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spb.app.item.clientes.ProductoClienteRest;
import com.spb.app.item.models.Item;
import com.spb.app.item.models.Producto;

@Service("serviceFeign")
public class ItemServiceFeign implements ItemService {

    @Autowired
    private ProductoClienteRest clienteFeign;

    @Override
    public List<Item> findAll() {
        return clienteFeign.listar().stream().map(prod -> new Item(prod, 1)).collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id, Integer cantidad) {
        return new Item(clienteFeign.ver(id), cantidad);
    }

    @Override
    public Producto save(Producto producto) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Producto update(Producto producto, Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub

    }

}
