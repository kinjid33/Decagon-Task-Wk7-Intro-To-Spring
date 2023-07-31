package com.ecommerce.akinjides.controller;

import com.ecommerce.akinjides.DTO.ProductDTO;
import com.ecommerce.akinjides.service.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//@Controller
public class ProductController {
    private ProductService productService;

//    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }



//    @GetMapping("/index")
//    public String productPage(Model model){
//        List<ProductDTO> products = productService.findAllProducts();
//        model.addAttribute("products", products);
//        return "index";
//    }
}
