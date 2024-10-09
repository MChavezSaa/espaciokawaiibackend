package com.example.espaciokawaiapp.controllers;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.espaciokawaiapp.entities.Producto;
import com.example.espaciokawaiapp.services.ProductoService;



@CrossOrigin("*")
@RestController
@RequestMapping("/productos")
public class ProductoController {
   
    @Autowired
    private ProductoService productoService;


    @GetMapping("/all")
    public List<Producto> getProductos() {
        return productoService.finAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity show(@PathVariable Long id) {
        Optional<Producto> optionalProducto = productoService.findById(id);
        if(optionalProducto.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(optionalProducto.orElseThrow());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
            Collections.singletonMap("Error", "No se encontro producto")
        );
    }
    
}
