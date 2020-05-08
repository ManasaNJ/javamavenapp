package com.mycompany.app;

/**
 * Hello world!Have a Great day
 */
public class App
{

    private final String message = "Hello World!Have a Great day";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
