package com.example.BankTestApp.validator;

import com.example.BankTestApp.annotation.UniqueCpf;
import com.example.BankTestApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class UniqueCpfValidator implements ConstraintValidator<UniqueCpf, String> {

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean isValid(String cpf, ConstraintValidatorContext context) {
        return userRepository.findByCpf(cpf) == null;
    }
}