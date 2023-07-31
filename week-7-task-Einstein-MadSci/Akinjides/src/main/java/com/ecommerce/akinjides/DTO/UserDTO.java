package com.ecommerce.akinjides.DTO;


import lombok.Builder;
import lombok.Data;

@Data
@Builder // The builder class has methods to set the values of the fields
// in the class and a build() method that creates a new object of the
// annotated class with the values set by the builder.
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String is_admin;
}
