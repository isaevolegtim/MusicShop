package com.company;

public class Main {

    public static void main(String[] args) { // Task number 1
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807L;           // Task number 2
        float e = 3.4f;
        double f = 1.7d;
        char g = 'g';
        boolean h = true;

        System.out.println(a * (b + (c / d))); // Task number 3

        int x = 555; // Task number 4
        int y = 6;
        int summa = x + y;
        if (summa>=10 & summa <= 20) {
            System.out.println("True");
            }
        else {
            System.out.println("False");
        }


        int opredelitelChisel = 0; // Task number 5
        if (opredelitelChisel <0) {
            System.out.println("Chislo otritsatelnoe!");
        }
        else {
            System.out.println("Chislo polojitelnoe!");
        }
        int opredelitelChisel2 = -10; // Task number 6
        if (opredelitelChisel2<0) {
            System.out.println("True");
        }
        System.out.println("Привет" + "AnyName"); // Task 7

        
    }
}
