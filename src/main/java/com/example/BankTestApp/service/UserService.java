package com.example.BankTestApp.service;

import com.example.BankTestApp.dto.request.UserDTO;
import com.example.BankTestApp.dto.response.MessageResponseDTO;
import com.example.BankTestApp.entity.User;
import com.example.BankTestApp.mapper.UserMapper;
import com.example.BankTestApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper = UserMapper.INSTANCE;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public MessageResponseDTO createUser(UserDTO userDTO) {
        User userToSave = userMapper.toModel(userDTO);

        User savedUser = userRepository.save(userToSave);
        return MessageResponseDTO
                .builder()
                .message("Usuário criado com sucesso")
                .build();
    }
}
