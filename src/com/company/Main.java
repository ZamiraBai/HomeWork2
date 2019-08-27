package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        String name = "Ilana";
        int age = 22;
        int temp = 28;
        if ((temp > 30 || temp < -20) || (age > 20 || age < 45)) {
            System.out.println("Не выходим гулять!");
        } else {
            System.out.println("Идем в гости к другу!");

        }
        if ((temp > 0 || temp < 28) && (age < 20)) {
            System.out.println("Не выходим гулять!");
        } else {
            System.out.println("Идем в гости к другу!");

        }
        if ((temp > -10 || temp < 25) && (age < 45)) {
            System.out.println("Не выходим гулять!");

        } else {
            System.out.println("Идем в гости к другу!");
        }

    }
}
