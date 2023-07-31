package com.ecommerce.akinjides.service.interfaces;

import com.ecommerce.akinjides.DTO.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//Abstracts the implementation of the product service class
public interface ProductService {
    List<ProductDTO> findAllProducts();
}