package com.mycompany.app;

/**
 * Hello world!Good Bye
 */
public class App
{

    private final String message = "Hello World!Good Bye";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMess());
    }

    private final String getMessage() {
        return message;
    }

}
