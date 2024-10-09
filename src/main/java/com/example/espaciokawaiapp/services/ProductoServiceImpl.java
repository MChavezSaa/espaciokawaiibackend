package com.example.espaciokawaiapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.espaciokawaiapp.entities.Producto;
import com.example.espaciokawaiapp.repositories.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{


    private ProductoRepository repository;

    public ProductoServiceImpl(ProductoRepository repository){
        this.repository =  repository;
    }

    @Transactional (readOnly = true)
    @Override
    public List<Producto> finAll() {
       return (List) this.repository.findAll();
    }


    @Transactional (readOnly = true)
    @Override
    public  Optional<Producto> findById(Long Id) {
        return  this.repository.findById(Id);
    }

    @Override
    @Transactional
    public Producto save(Producto prod) {
        return  this.repository.save(prod);
    }

    @Override
    @Transactional
    public void deleteById(Long Id) {
         this.repository.deleteById(Id);
    }


}