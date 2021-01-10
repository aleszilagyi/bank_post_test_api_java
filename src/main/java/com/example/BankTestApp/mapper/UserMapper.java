package com.example.BankTestApp.mapper;

import com.example.BankTestApp.dto.request.UserDTO;
import com.example.BankTestApp.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "birthdate", target = "birthdate", dateFormat = "dd/MM/yyyy")
    User toModel(UserDTO userDTO);

    UserDTO toDTO(User person);
}
