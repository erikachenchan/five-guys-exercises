package org.example;

import java.util.Scanner;

public class BurgerUI {

    private static Scanner scanner;
    private BurgerManager burgerManager;

    public BurgerUI(Scanner scanner, BurgerManager burgerManager) {
        this.scanner = scanner;
        this.burgerManager = burgerManager;
    }

    public void start() {
        while (true) {
            try {
                System.out.println("Name of burger: ");
                String burgerName = scanner.nextLine();

                System.out.println("Burger price: ");
                double burgerPrice = Double.parseDouble(scanner.nextLine());

                System.out.println("Burger calories: ");
                Integer burgerCalories = Integer.parseInt(scanner.nextLine());


                if (burgerName.equals("end")) {
                    break;
                }

                burgerManager.addBurger(new Burger(burgerName, burgerPrice, burgerCalories));

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        System.out.println(burgerManager.getAllBurgers());


    }

}
