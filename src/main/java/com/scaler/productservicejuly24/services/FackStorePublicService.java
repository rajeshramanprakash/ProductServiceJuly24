package com.scaler.productservicejuly24.services;

import com.scaler.productservicejuly24.dtos.FackStorePublicdtos;
import com.scaler.productservicejuly24.models.category;
import com.scaler.productservicejuly24.models.product;
import jdk.jfr.Category;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
@Service
public class FackStorePublicService implements productService {
    private RestTemplate restTemplate;
    public FackStorePublicService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @Override
    public product getSingleProduct(Long productId) {
        FackStorePublicdtos fackStorePublicdtos = restTemplate.getForObject(
                "http://fakestoreapi.com/products/" + productId,
                FackStorePublicdtos.class);
        //    convert FackStore to  product

        return convertDtoToProduct(fackStorePublicdtos);
    }



    @Override
    public List<product> getAllProduct() {
        FackStorePublicdtos[] fackStorePublicdtos = restTemplate.getForObject(
                "https://fakestoreapi.com/products",
                FackStorePublicdtos[].class);
//        convert of list of fackstoreproduct into list of product
        List<product> products = new ArrayList<>();
        for (FackStorePublicdtos fackStorePublicdto : fackStorePublicdtos) {
            products.add(convertDtoToProduct(fackStorePublicdto));
        }

        return products;
    }
    private product convertDtoToProduct(FackStorePublicdtos fackStorePublicdtos) {
        product  product  = new product();
        product.setId(fackStorePublicdtos.getId());
        product.setTitle(fackStorePublicdtos.getTitle());
        product.setPrice(fackStorePublicdtos.getPrice());


        category category = new category();
        category.setDescreption(fackStorePublicdtos.getDescription());
        product.setCategory(category);

        return  product;
    }
}
