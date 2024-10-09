package com.example.espaciokawaiapp.services;

import java.util.List;
import java.util.Optional;

import com.example.espaciokawaiapp.entities.Producto;

public interface  ProductoService {
    List<Producto> finAll();
    Optional<Producto> findById(Long Id);
    Producto save(Producto prod);
    void deleteById(Long Id);


}
