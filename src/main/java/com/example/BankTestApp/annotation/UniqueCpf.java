package com.example.BankTestApp.annotation;

import com.example.BankTestApp.validator.UniqueCpfValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = UniqueCpfValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueCpf {
    String message() default "Número de CPF em uso";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
