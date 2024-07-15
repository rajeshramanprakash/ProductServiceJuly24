package com.scaler.productservicejuly24.services;

import com.scaler.productservicejuly24.models.product;

import java.util.List;

public interface productService {
    product getSingleProduct(Long productId);

    List<product> getAllProduct();

    product updateProduct(Long id, product product);

    //put (All change)
    product replaceProduct(Long id, product product);

    product removeProduct(Long id, product product);
    void  deleteProduct(Long id);
}
