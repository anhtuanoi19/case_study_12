package com.example.casestudy3.repository;

import com.example.casestudy3.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
    @Query("SELECT p FROM Product p join fetch p.categories where p.categories.code =:code")
    List<Product> findByStatus(@Param("code") String code);
}
