package com.pm.products.client.controller;import com.pm.products.client.model.Product;import com.pm.products.client.service.ProductServiceHttpClient;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.web.bind.annotation.*;import java.util.List;@RestController@RequestMapping("/client/products")public class ProductServiceClientController {    @Autowired    private ProductServiceHttpClient productServiceHttpClient;    @GetMapping    public List<Product> getAllProducts() {        return productServiceHttpClient.getAllProducts();    }    @PostMapping    public Product addProduct(@RequestBody Product product) {        return productServiceHttpClient.addProduct(product);    }    @GetMapping("/{productId}")    public Product getProductById(@PathVariable int productId) {        return productServiceHttpClient.getProductById(productId);    }}