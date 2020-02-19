package org.acme;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().message());
    }

    protected String message() {
        return "Hello World!";
    }
}