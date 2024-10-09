package com.example.espaciokawaiapp.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.espaciokawaiapp.entities.Producto;

@Repository
public interface  ProductoRepository extends CrudRepository<Producto, Long>{

}
