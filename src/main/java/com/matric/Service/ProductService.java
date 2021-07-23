package com.matric.service;

import com.matric.beans.Product;
import io.swagger.models.auth.In;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    Product createProduct(Product product);

    Product getProduct(Integer id);

    Product updateProduct(Integer id, Product product);

    void deleteProduct(Integer id);
}
