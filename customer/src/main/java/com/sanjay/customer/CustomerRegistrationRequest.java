package com.sanjay.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
