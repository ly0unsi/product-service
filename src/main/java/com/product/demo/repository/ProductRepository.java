package com.product.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.product.demo.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}
