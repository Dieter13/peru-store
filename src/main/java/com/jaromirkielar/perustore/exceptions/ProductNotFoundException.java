package com.jaromirkielar.perustore.exceptions;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException() { };

    public ProductNotFoundException(final String message) {
        super(message);
    }
}


