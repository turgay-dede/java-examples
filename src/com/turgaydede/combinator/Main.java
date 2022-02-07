package com.turgaydede.combinator;

import java.time.LocalDate;

import static com.turgaydede.combinator.CustomerValidatorService.*;

public class Main {
    public static void main(String[] args) {
        Customer customer =
                new Customer("Turgay", "+05555555555", "turgay@turgay.com", LocalDate.of(1996, 2, 1));

        ValidationResult result = isValidEmail()
                .and(isValidPhoneNumber())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);
    }
}
