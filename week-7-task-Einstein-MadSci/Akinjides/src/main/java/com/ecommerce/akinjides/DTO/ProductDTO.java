package com.ecommerce.akinjides.DTO;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

//this class is used to prevent users direct access to Product class
@Data
@Builder // The builder class has methods to set the values of the fields
// in the class and a build() method that creates a new object of the
// annotated class with the values set by the builder.
public class ProductDTO {
    private Long productId;
    private String category;
    private String productName;
    private BigDecimal price;
    private String image;

}
