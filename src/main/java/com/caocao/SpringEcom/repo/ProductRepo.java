package com.caocao.SpringEcom.repo;

import com.caocao.SpringEcom.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
