package com.example.shoppingverse.exception;

public class InsufficientQuantityException extends RuntimeException{

    public InsufficientQuantityException(String message){
        super(message);
    }
}
