package dev.malva.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.malva.product.entity.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product, Long>{

}
