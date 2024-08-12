package com.proj.productservicequickkart.services;

import com.proj.productservicequickkart.models.Products;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class FakeStoreProductService implements ProductServiceInterface{
    @Override
    public Products getSingleProduct(Long id) {
        return new Products();
    }

    @Override
    public List<Products> getAllProducts() {
        return List.of();
    }
}
