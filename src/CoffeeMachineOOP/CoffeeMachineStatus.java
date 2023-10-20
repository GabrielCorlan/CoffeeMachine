package CoffeeMachineOOP;

import java.util.Scanner;

enum States {
    ACTION,
    COFFEE


}

public enum CoffeeMachineStatus {

    BUY, FILL, TAKE, REMAINING, EXIT;


    public static void getCoffee(String input) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            if (input.equals(BUY)) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String choice = sc.nextLine();

                switch (choice) {
                    case "1":
                        if (waterAmount >= 250 && beansAmount >= 16 && cupsAmount >= 1) {
                            System.out.println("I have enough resources, making you a coffee!");
                            waterAmount -= 250;
                            beansAmount -= 16;
                            moneyAmount += 4;
                            cupsAmount -= 1;
                        } else if (waterAmount < 250) {
                            System.out.println("Sorry, not enough water!");
                        } else if (beansAmount < 16) {
                            System.out.println("Sorry, not enough coffee beans!");
                        }
                        break;
                    case "2":
                        if (waterAmount >= 350 && milkAmount >= 75 && beansAmount >= 20 && cupsAmount >= 1) {
                            System.out.println("I have enough resources, making you a coffee!");
                            waterAmount -= 350;
                            milkAmount -= 75;
                            beansAmount -= 20;
                            moneyAmount += 7;
                            cupsAmount -= 1;
                        } else if (waterAmount < 350) {
                            System.out.println("Sorry, not enough water!");
                        } else if (milkAmount < 75) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (beansAmount < 20) {
                            System.out.println("Sorry, not enough coffee beans!");
                        }
                        break;
                    case "3":
                        if (waterAmount >= 200 && milkAmount >= 100 && beansAmount >= 12 && cupsAmount > 0) {
                            System.out.println("I have enough resources, making you a coffee!");
                            waterAmount -= 200;
                            milkAmount -= 100;
                            beansAmount -= 12;
                            moneyAmount += 6;
                            cupsAmount -= 1;
                        } else if (waterAmount < 200) {
                            System.out.println("Sorry, not enough water!");
                        } else if (milkAmount < 100) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (beansAmount < 12) {
                            System.out.println("Sorry, not enough coffee beans!");
                        }
                        break;
                    case "back":
                        continue;
                }
                System.out.println();
            } else if (input.equals("fill")) {
                System.out.println("Write how many ml of water do you want to add:");
                int amount = sc.nextInt();
                waterAmount += amount;
                System.out.println("Write how many ml of milk do you want to add:");
                amount = sc.nextInt();
                milkAmount += amount;
                System.out.println("Write how many grams of coffee beans do you want to add:");
                amount = sc.nextInt();
                beansAmount += amount;
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                amount = sc.nextInt();
                cupsAmount += amount;

                System.out.println();
                continue;
            } else if (input.equals("take")) {
                System.out.println("I gave you " + moneyAmount);
                moneyAmount -= moneyAmount;
                System.out.println();

            } else if (input.equals("remaining")) {
                showStatus(waterAmount, milkAmount, beansAmount, cupsAmount, moneyAmount);

            } else if (input.equals("exit")) {
                break;
            }
        }
    }

    static void showStatus(int water, int milk, int beans, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money");
        System.out.println();
    }


}

