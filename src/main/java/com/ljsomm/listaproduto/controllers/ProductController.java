package com.ljsomm.listaproduto.controllers;


import com.ljsomm.listaproduto.models.Product;
import com.ljsomm.listaproduto.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProductController {

    @Autowired
    ProductRepository pr;

    @GetMapping
    public List<Product> findAll(){
        return pr.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> findById(@PathVariable("id") Integer a){
        return pr.findById(a);
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        return pr.save(product);
    }

    @PutMapping
    public Product update(@RequestBody Product product){
        Product prod = pr.getById(product.getId());
        prod.setName(product.getName());
        prod.setQuantity(product.getQuantity());
        return pr.save(prod);
    }

    @DeleteMapping
    public Product delete(@RequestBody Product product){
         pr.delete(product);
        return product;
    }



}
