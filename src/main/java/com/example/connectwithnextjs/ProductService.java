package com.example.connectwithnextjs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;
    @Autowired
    LoginRep loginrep;

    public List<Product> getAll() {
        return repo.findAll();
    }

    public void save(List<Product> p) {
         repo.saveAll(p);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public void savelogin(List<Login> login) {
         loginrep.saveAll(login);

    }
}
