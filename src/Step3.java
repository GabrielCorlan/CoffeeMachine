import java.util.Scanner;

public class Step3 {
    /*Description
Let's simulate an actual coffee machine. It has a limited supply of water, milk, coffee beans, and disposable cups.
Also, it counts how much money it gets for selling coffee. The coffee machine has several options:
first, it needs to be able to sell coffee. It can make different varieties of coffee: espresso, latte, and cappuccino.
Of course, each variety requires a different amount of supplies, except that all of them requires only one disposable cup.
Second, the coffee machine should be able to get replenished by a special worker.
Third, another special worker should be able to take money from the coffee machine.

Write the program that can do one of these actions at a time. It reads one line from standard input, which can be "buy", "fill", "take".
If you want to buy some coffee, input "buy". If you are a special worker and you think that it is time to fill out all the supplies for
the coffee machine, input "fill". If you are another special worker and it is time to take the money from the coffee machine, input "take".

If the user writes "buy" then he must choose one of three varieties of coffee that the coffee machine can make:
espresso, latte, or cappuccino.

For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.
If the user writes "fill", the program should ask him how much water, milk, coffee and how many disposable cups he wants to add
into the coffee machine.

If the user writes "take" the program should give him all the money that it earned from selling coffee.

At the moment, the coffee machine has $550, 400 ml of water, 540 ml of milk, 120 g of coffee beans, and 9 disposable cups.

Write the program that prints the coffee machine’s state, processes one query from the user, and also prints the coffee machine’s
state after that. Try to use methods to implement every action that the coffee machine can do.

Instruction
Write a program that offers to buy one cup of coffee or to fill the ingredients or to take it's money.
At the same time, the program should calculate how many ingredients it has left.
And also display the number of ingredients before and after purchase.

Examples

An espresso should be as number 1 in the list, a latte as number 2 and a cappuccino as number 3.
Options also should be named as "buy", "fill", "take".
The symbol > represents the user input. Notice that it's not the part of the input.

Example 1
The coffee machine has:
400 of water
540 of milk
120 of coffee beans
9 of disposable cups
550 of money

Write action (buy, fill, take):
> buy
What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:
> 3

The coffee machine has:
200 of water
440 of milk
108 of coffee beans
8 of disposable cups
556 of money

Example 2
The coffee machine has:
400 of water
540 of milk
120 of coffee beans
9 of disposable cups
550 of money

Write action (buy, fill, take):
> fill
Write how many ml of water do you want to add:
> 2000
Write how many ml of milk do you want to add:
> 500
Write how many grams of coffee beans do you want to add:
> 100
Write how many disposable cups of coffee do you want to add:
> 10

The coffee machine has:
2400 of water
1040 of milk
220 of coffee beans
19 of disposable cups
550 of money

Example 3
The coffee machine has:
400 of water
540 of milk
120 of coffee beans
9 of disposable cups
550 of money

Write action (buy, fill, take):
> take
I gave you $550

The coffee machine has:
400 of water
540 of milk
120 of coffee beans
9 of disposable cups
0 of money*/

    public static void main(String[] args) {
        int waterAmount = 400;
        int milkAmount = 540;
        int beansAmount = 120;
        int cupsAmount = 9;
        int moneyAmount = 550;
        String action;

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = sc.nextLine();
            System.out.println();

            if (action.equals("buy")) {
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
            } else if (action.equals("fill")) {
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
            } else if (action.equals("take")) {
                System.out.println("I gave you " + moneyAmount);
                moneyAmount -= moneyAmount;
                System.out.println();

            } else if (action.equals("remaining")) {
                showStatus(waterAmount, milkAmount, beansAmount, cupsAmount, moneyAmount);

            } else if (action.equals("exit")) {
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
