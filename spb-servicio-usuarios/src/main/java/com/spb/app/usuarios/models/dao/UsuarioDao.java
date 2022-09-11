package com.spb.app.usuarios.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.spb.app.usuarios.models.entity.Usuario;

public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long> {

    public Usuario findByUsername(String username);

    // // Another Option
    // @Query("select u from Usuario u where u.username=?1")
    // public Usuario obtenerPorUsername(String username);
}
