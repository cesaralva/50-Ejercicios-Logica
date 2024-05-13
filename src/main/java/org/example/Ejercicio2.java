package org.example;

public class Ejercicio2 {

    public static void main(String[] args) {
        // pregunta 2
        for (int i = 50; i < 99; i++) {

            int num1 = 2;
            int total = (i++ + num1);

            System.out.print(total + "-");
        }
    }
}
