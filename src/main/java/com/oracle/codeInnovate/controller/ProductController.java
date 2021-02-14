package com.oracle.codeInnovate.controller;

import java.util.*;

import com.oracle.codeInnovate.domain.Product;
import com.oracle.codeInnovate.service.ProductService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> list() {
        return service.listAll();
    }

    // RESTful API method for Create operation

    // RESTful API method for Update operation

    // RESTful API method for Delete operation
}
