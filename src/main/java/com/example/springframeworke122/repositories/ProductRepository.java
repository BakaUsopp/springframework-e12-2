package com.example.springframeworke122.repositories;

import com.example.springframeworke122.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product,Integer>{

    @Query(value = "SELECT * FROM product WHERE name=:name",nativeQuery = true)
    List<Product> findProductByName(String name);
}
