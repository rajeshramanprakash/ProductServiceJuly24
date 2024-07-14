package com.scaler.productservicejuly24.services;

import com.scaler.productservicejuly24.models.product;

import java.util.List;

public interface productService {
    product getSingleProduct(Long productId);

    List<product> getAllProduct();
}
