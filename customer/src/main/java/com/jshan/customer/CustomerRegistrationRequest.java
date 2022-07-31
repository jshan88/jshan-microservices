package com.jshan.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
