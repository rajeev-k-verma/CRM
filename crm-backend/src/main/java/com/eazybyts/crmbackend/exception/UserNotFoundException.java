package com.eazybyts.crmbackend.exception;
/* Created by Rajeev Verma */

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not found the user with id "+ id);
    }
}
