package com.mayank.converters;

import com.mayank.commands.ProductForm;
import com.mayank.domain.Product;

public class ProductToProductForm {
    public ProductForm convert(Product product) {
        ProductForm productForm = new ProductForm();
        productForm.setId(product.getId());
        productForm.setDescription(product.getDescription());
        productForm.setPrice(product.getPrice());
        productForm.setImageUrl(product.getImageUrl());
        return productForm;
    }
}
