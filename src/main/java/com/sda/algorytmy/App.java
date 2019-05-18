package com.sda.algorytmy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe wyrazow: ");
        int n = scanner.nextInt();
        System.out.println("podaj pierwszy wyraz: ");
        int a1 = scanner.nextInt();
        System.out.println("podaj przyrost: ");
        int r = scanner.nextInt();
        System.out.println(a1);

        // (a1 + (i -1) * r)

        for (int i = 2; i <= n; i++) {

            System.out.println((a1 + (i - 1) * r));

        }

    }
}

