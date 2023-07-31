package com.ecommerce.akinjides.service.interfaces;

import com.ecommerce.akinjides.DTO.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> findAllUsers();
}
