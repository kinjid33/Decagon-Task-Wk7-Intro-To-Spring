package com.ecommerce.akinjides.service.implementation;

import com.ecommerce.akinjides.DTO.UserDTO;
import com.ecommerce.akinjides.model.User;
import com.ecommerce.akinjides.repository.UserRepo;
import com.ecommerce.akinjides.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public List<UserDTO> findAllUsers() {
        List<User> users = userRepo.findAll();
        return users.stream().map((user) -> mapToUserDTO(user)).collect(Collectors.toList());
    }

    private UserDTO mapToUserDTO(User user){
        UserDTO userDTO =  UserDTO.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .password(user.getPassword())
                .is_admin(user.getIs_admin())
                .build();
        return userDTO;
    }
}
