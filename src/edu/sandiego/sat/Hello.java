package edu.sandiego.sat;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Hello {
    private static int getANumber() {
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("Please enter an integer:");

        int enteredNum = -1;
        try {
            enteredNum = getANumber();
        } catch (InputMismatchException e) {
            System.out.println("That wasn't a valid integer. Sorry!");
            System.exit(1);
        }

        System.out.println("You entered: " + enteredNum);

        System.out.println("Item has been added to the database!");
    }
}
