import java.util.Scanner;

public class Step1 {

    /*Description 1
Now let's consider a case where you need a lot of coffee. Maybe, for example, you’re hosting a party with a lot of guests.
The program should calculate how much water, coffee, and milk are necessary to make the specified amount of coffee.
One cup of coffee made on this coffee machine contains 200 ml of water, 50 ml of milk, and 15 g of coffee beans.

The user should input the amount of coffee he needs, in cups, for all the guests.
Of course, all this coffee is not needed right now, so at this stage, the coffee machine doesn’t actually make any coffee.

Instruction
Write a program that calculates the amount of ingredients needed to make a certain amount of coffee.

Examples
The example below shows how your output might look.
The symbol > represents the user input. Notice that it's not the part of the input.

Example 1
Write how many cups of coffee you will need:
> 25
For 25 cups of coffee you will need:
5000 ml of water
1250 ml of milk
375 g of coffee beans

Example 2
Write how many cups of coffee you will need:
> 125
For 125 cups of coffee you will need:
25000 ml of water
6250 ml of milk
1875 g of coffee beans*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write how many cups of coffee you will need:");
        int cups = sc.nextInt();
        System.out.println("For " + cups + " cups of coffee you will need:");
        System.out.println((200 * cups) + " ml of water");
        System.out.println((50 * cups) + " ml of milk");
        System.out.println((15 * cups) + " g of coffee beans");
    }
}
