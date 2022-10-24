package com.ap.ap.exception;

public class UsuarioNotFoundException extends RuntimeException{
    public UsuarioNotFoundException(String message) {
        super(message);
    }
}
