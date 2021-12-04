package com.matric.serviceimpl;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.matric.beans.Product;

//import com.matric.repository.ProductRepository;
import com.matric.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.github.fge.jsonpatch.JsonPatch;

//import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    public ProductServiceImpl() {
        Product product = new Product();
        product.setId(1);
        product.setName("Car");
        product.setMfCompany("TATA");
        product.setMfDate(new Date());
        product.setExpDate(new Date());
        product.setColor("red");
        products.add(product);
    }

    private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
    List<Product> products = new ArrayList<>();


//    private @Autowired ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        logger.info("get products");
        return products;
    }


    @Override
    public Product createProduct(Product product) {
        logger.info("create product");
        products.add(product);
        return product;
    }

    @Override
    public Product getProduct(Integer id) {
        logger.info("get product by id: {}", id);
        return products.get(id);
    }

    @Override
    public Product updateProduct(Integer id, JsonPatch patch) throws Exception {
        logger.info("update product id: {}", id);
        Product on = products.get(id);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        JsonNode patched = patch.apply(objectMapper.convertValue(on, JsonNode.class));
        return objectMapper.treeToValue(patched, on.getClass());
    }

//    @Transactional
//    @Modifying
    @Override
    public void deleteProduct(Integer id) {
        logger.info("delete product id: {}", id);
        products.remove(products.get(id));
    }
}
