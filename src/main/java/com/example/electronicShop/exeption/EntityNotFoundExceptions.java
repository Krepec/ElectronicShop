package com.example.electronicShop.exeption;

public class EntityNotFoundExceptions extends Exception {

    EntityNotFoundExceptions(String message){
        super("Nie znaleziono obiektu");
    }
}
