package org.acme;

public class DefaultMessageProvider implements MessageProvider {
    @Override
    public String message() {
        return "Hello World!";
    }
}