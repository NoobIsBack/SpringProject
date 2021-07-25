//package com.mayank.converters;
//
//import com.mayank.commands.ProductForm;
//import com.mayank.domain.Product;
//import org.springframework.util.StringUtils;
//
//public class ProductFormToProduct {
//    public Product convert(ProductForm productForm) {
//        Product product = new Product();
//        if (productForm.getId() != null  && !StringUtils.isEmpty(productForm.getId())) {
//            product.setId(productForm.getId());
//        }
//        product.setDescription(productForm.getDescription());
//        product.setPrice(productForm.getPrice());
//        product.setImageUrl(productForm.getImageUrl());
//        return product;
//    }
//}
