package com.example.BankTestApp.dto.request;

//import com.example.BankTestApp.annotation.UniqueCpf;

import com.example.BankTestApp.annotation.UniqueCpf;
import com.example.BankTestApp.annotation.UniqueEmail;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;

    @NotBlank(message = "Nome não preenchido. Favor, digite o nome completo")
    @Size(min = 2, max = 155, message = "Nome inválido, digite o nome completo")
    private String name;

    @UniqueEmail
    @NotBlank(message = "Email não preenchido. Favor, digite um email")
    @Email(message = "Email inválido")
    private String email;

    private String birthdate;

    @UniqueCpf
    @NotBlank(message = "CPF não preenchido, Favor, digite o CPF")
    @CPF(message = "CPF inválido, confira novamente os números")
    private String cpf;

}
