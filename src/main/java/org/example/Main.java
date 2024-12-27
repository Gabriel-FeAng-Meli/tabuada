package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("\n============================================================\n");

        System.out.println("Escolha um número:");

        number = inputScanner.nextInt();

        inputScanner.close();

        System.out.println("\nTabuada do " + number + ":\n");

        for (int i = 0; i < 10; i++) {
            int result = number * i;
            System.out.println("\t " + i + " * " + number + " = " + result);
        }

        System.out.println("\n============================================================\n");

    }
}