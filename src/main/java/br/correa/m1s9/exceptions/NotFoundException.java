package br.correa.m1s9.exceptions;

import lombok.NoArgsConstructor;

public class NotFoundException extends Exception{

    public NotFoundException(String message){
        super(message);
    }
}
