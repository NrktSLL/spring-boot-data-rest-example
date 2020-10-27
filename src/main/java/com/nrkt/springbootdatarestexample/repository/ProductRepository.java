package com.nrkt.springbootdatarestexample.repository;

import com.nrkt.springbootdatarestexample.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {

   @RestResource(rel = "name-contains", path = "name-contains")
   Optional<Product> findByName(String name);
}
