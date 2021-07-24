package com.matric.service;

import com.matric.beans.Product;
import com.github.fge.jsonpatch.JsonPatch;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    Product getProduct(Integer id);

    Product createProduct(Product product);

    Product updateProduct(Integer id, JsonPatch product) throws Exception;

    void deleteProduct(Integer id);
}
