package com.company;

public class TooFarException extends Exception {
    public TooFarException() {
        super("Jesteś za daleko!");
    }
}
