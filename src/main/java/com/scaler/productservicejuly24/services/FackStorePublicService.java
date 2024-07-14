package com.scaler.productservicejuly24.services;

import com.scaler.productservicejuly24.models.product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FackStorePublicService implements productService {
    @Override
    public product getSingleProduct(Long productId) {
        return new product();
    }

    @Override
    public List<product> getAllProduct() {
        return List.of();
    }
}
