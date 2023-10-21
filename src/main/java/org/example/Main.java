package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BurgerManager burgerManager = new BurgerManager();

        BurgerUI burgerUI = new BurgerUI(scanner, burgerManager);
        System.out.println("What's your order?");
        burgerUI.start();
    }
}