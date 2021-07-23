package com.matric.serviceimpl;

import com.matric.beans.Product;
import com.matric.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {


    @Override
    public List<Product> getProducts() {
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Mobile");
        product1.setColor("black");
                product1.setCost(Double.valueOf(32000.00d));
                product1.setExpDate(new Date());
                product1.setMfDate(new Date());
                product1.setMfCompany("Samsung");

        Product product2 = new Product();
        Product product3 = new Product();
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        return products;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product getProduct(Integer id) {
        return null;
    }

    @Override
    public Product updateProduct(Integer id, Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Integer id) {

    }
}
