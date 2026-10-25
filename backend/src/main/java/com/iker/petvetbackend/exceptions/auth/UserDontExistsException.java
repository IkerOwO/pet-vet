package com.iker.petvetbackend.exceptions.auth;

public class UserDontExistsException extends RuntimeException{
    public UserDontExistsException(String message) {
        super(message);
    }
}