package com.ecommerce.akinjides.service.implementation;

import com.ecommerce.akinjides.DTO.ProductDTO;
import com.ecommerce.akinjides.model.Product;
import com.ecommerce.akinjides.repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service // this identifies the class as a service implementation
public class ProductServiceImpl {
    private ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

//    The method findAllProducts retrieves all Product entities
//    from the database, and then maps each Product to a
//    ProductDTO using the mapToProductDTO method.
    public List<ProductDTO> findAllProducts(){
//        findAll returns a list of product objects
        List<Product> products = productRepo.findAll();
//        map() method to apply a lambda function
//        to each Product object in the stream. This lambda
//        function calls the mapToProductDTO method with each
//        Product object as an argument to convert it to a
//        ProductDTO object.
        return products.stream().map((product) -> mapToProductDTO(product)).collect(Collectors.toList());
    }

//    map to product dto converts product objects to productDTO
//    setting product fields to the relevant values
    private ProductDTO mapToProductDTO(Product product){
        ProductDTO productDTO =  ProductDTO.builder()
                .productId(product.getProductId())
                .category(product.getCategory())
                .productName(product.getProductName())
                .price(product.getPrice())
                .image(product.getImage())
                .build();
        return productDTO;
    }
}
