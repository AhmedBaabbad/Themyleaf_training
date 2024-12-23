package com.example.Thymeleaf.service;


import com.example.Thymeleaf.domain.Product;

import java.util.List;

/**
 * Created by jt on 1/26/16.
 */
public interface ProductService {

    Product getProduct(String id);

    List<Product> listProducts();
}
