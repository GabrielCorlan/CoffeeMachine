package CoffeeMachineOOP;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String input = sc.nextLine();


        while (sc.hasNext()) {
            CoffeeMachine.getCoffee(input);
        }
    }
}
