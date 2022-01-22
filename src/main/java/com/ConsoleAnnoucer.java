package com;

public class ConsoleAnnoucer implements Annoucer {
    @Override
    public void announce(String message) {
        System.out.println(message);
    }
}
