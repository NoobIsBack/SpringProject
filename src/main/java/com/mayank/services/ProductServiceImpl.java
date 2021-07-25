//package com.mayank.services;
//
//import com.mayank.commands.ProductForm;
//import com.mayank.converters.ProductFormToProduct;
//import com.mayank.domain.Product;
//import com.mayank.repository.ProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.UUID;
//
//public class ProductServiceImpl implements ProductService {
//
//
//    private ProductRepository productRepository;
//    private ProductFormToProduct productFormToProduct;
//
//    @Autowired
//    public ProductServiceImpl(ProductRepository productRepository, ProductFormToProduct productFormToProduct) {
//        this.productRepository = productRepository;
//        this.productFormToProduct = productFormToProduct;
//    }
//
//    @Override
//    public List<Product> listAll() {
//        List<Product> products = new ArrayList<>();
//        productRepository.findAll().forEach(products::add);
//        return products;
//    }
//
//    @Override
//    public Product getById(UUID id) {
//        return productRepository.findById(id).orElse(null);
//    }
//
//    @Override
//    public Product saveOrUpdate(Product product) {
//        productRepository.save(product);
//        return product;
//    }
//
//    @Override
//    public void delete(UUID id) {
//        productRepository.deleteById(id);
//    }
//
//    @Override
//    public Product saveOrUdpateProductForm(ProductForm productForm) {
//        Product savedProduct = saveOrUpdate(productFormToProduct.convert(productForm));
//        System.out.println("Saved product is " + savedProduct.getId());
//        return savedProduct;
//    }
//}
