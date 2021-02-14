package com.oracle.codeInnovate.repositories;

import com.oracle.codeInnovate.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
