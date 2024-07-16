package com.scaler.productservicejuly24.controller;

import com.scaler.productservicejuly24.models.product;
import com.scaler.productservicejuly24.services.productService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private productService productService;




    public ProductController(productService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<product> getProductById(@PathVariable("id") Long id){
        ResponseEntity<product> responseEntity = new ResponseEntity<>(
                productService.getSingleProduct(id), HttpStatus.FORBIDDEN
        );
        return responseEntity;
//        return  null;
    }
    @GetMapping()
    public List<product> getAllProducts(){
        return productService.getAllProduct();
    }
    public void deleteProductById(Long id){

    }
//    put
//    partical update
@PutMapping("/{id}")

    public product replaceProduct(@PathVariable("id") Long id, @RequestBody product product){


        return null;
    }

//    PATCH
//    full update

@PatchMapping ("/{id}")
    public  product updateProduct(@PathVariable("id") Long id,@RequestBody product product){
        return productService.updateProduct(id, product);
    }

}
