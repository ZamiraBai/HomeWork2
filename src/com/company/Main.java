package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        String name = "Ilana";
        System.out.println(name);
        int age = 23;
        System.out.println(age);
        int temp = 28;
        if (temp < 30 || temp > -20 && age > 20 || age < 45) ;
        if (temp < 0 || temp > 28 && age < 20) ;
        if (temp < -10 || temp > 25 && age > 45) ;
        else {
            System.out.println("Не выходим гулять!");
            System.out.println("Идем в гости к другу!");
        }
    }
}
