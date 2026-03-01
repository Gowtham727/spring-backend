package com.example.connectwithnextjs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:3000")
public class NexJsController {

    @Autowired
    private ProductService service;
    @PostMapping("/login")
    public void login(@RequestBody List<Login> login){
        service.savelogin(login);
    }

    @GetMapping("/")
    public List<Product> getProducts() {
        return service.getAll();
    }

    @PostMapping("/post")
    public void addProduct(@RequestBody List<Product> product) {
         service.save(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        service.delete(id);
    }
}