package com.syntax.class15;

import groovy.console.ui.SystemOutputInterceptor;

public class Task6 {

    void sayHello(String country){
        String hello;
        switch(country){
            case "USA":
                hello="Hola";
                break;
            case "Russia":
                hello="Privet";
                break;
            case "France":
                hello="bonjour";
                break;
            case "India":
                hello="Namaste";
                break;
            case "Turkey":
                hello="Murhaba";
                break;
            case "Pakistan":
                hello="Salam";
                break;
            default:
                hello="Country not found";
        }
        System.out.println(hello);
    }
    public static void main(String[] args) {
        Task6 task6=new Task6();
        task6.sayHello("India");
    }
}
