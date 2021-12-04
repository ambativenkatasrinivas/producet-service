package com.matric.controller;

import com.github.fge.jsonpatch.JsonPatch;
import com.matric.beans.Product;
import com.matric.service.ProductService;
import com.matric.serviceimpl.ProductServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.web.JsonPath;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/product")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);


    @Autowired private ProductService productService;

    @GetMapping
    public ResponseEntity<?> getProducts() {
        try {
            logger.info("get products");
            return ResponseEntity.ok(productService.getProducts());
        } catch (Exception e) {
            logger.error("Exception occurred while getting products", e);
            return new ResponseEntity<>("", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProduct(@PathVariable Integer id) {
        try {
            logger.info("Get product by id: {}", id);
            return ResponseEntity.ok(productService.getProduct(id));
        } catch (Exception e) {
            logger.error("Exception occurred while getting product by id: {}", id, e);
            return new ResponseEntity<>("", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody Product product) {
        try {
            logger.info("Creating product with request: {}", product);
            return ResponseEntity.ok(productService.createProduct(product));
        } catch (Exception e) {
            logger.error("Exception occurred while creating product with req: {}", product, e);
            return new ResponseEntity<>("", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PatchMapping(path = "/{id}", consumes = "application/json-patch+json")
    public ResponseEntity<?> updateProduct(@PathVariable Integer id, @RequestBody JsonPatch patch) {
        try {
            logger.info("updating product id: {}, req: {}", id, patch);
            return ResponseEntity.ok(productService.updateProduct(id, patch));
        } catch (Exception e) {
            logger.error("Exception occurred while updating product id: {}, req: {}", id, patch, e);
            return new ResponseEntity<>("", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Integer id) {
        try {
            logger.info("Deleting product id: {}", id);
            productService.deleteProduct(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            logger.error("Exception occurred while deleting product id: {}", id, e);
            return new ResponseEntity<>("", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
