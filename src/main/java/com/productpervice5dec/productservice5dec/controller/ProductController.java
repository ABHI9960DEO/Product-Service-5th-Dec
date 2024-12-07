package com.productpervice5dec.productservice5dec.controller;

import com.productpervice5dec.productservice5dec.model.Product;
import jdk.jfr.Registered;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //In Spring Boot, @RestController is a specialized version of @Controller
                   // that is specifically designed to handle RESTful web services. It simplifies
                   // the development of REST APIs by combining two annotations: @Controller and @ResponseBody.
public class ProductController {
    @RequestMapping("/addproduct")
    public void createProduct(Product product) {

    }

    public void updateProduct(Product product) {

    }

    public void deleteProduct(Long productId) {

    }

    public Product getProduct(Long productId) {
        return null;
    }
}
