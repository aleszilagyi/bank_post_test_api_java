package com.example.BankTestApp.repository;

import com.example.BankTestApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(final String email);

    User findByCpf(final String cpf);
}
