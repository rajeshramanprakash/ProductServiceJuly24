package com.scaler.productservicejuly24.controller;

import com.scaler.productservicejuly24.ProductServiceJuly24Application;
import com.scaler.productservicejuly24.models.product;
import com.scaler.productservicejuly24.services.FackStorePublicService;
import com.scaler.productservicejuly24.services.productService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private productService productService;




    public ProductController(productService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public product getProductById(@PathVariable("id") Long id){
        return  productService.getSingleProduct(id);
//        return  null;
    }
    @GetMapping()
    public List<product> getAllProducts(){
        return productService.getAllProduct();
    }
//    public addNewProduct(){
//
//    }

}
