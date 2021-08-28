package Ulessanne1;

// Task 5 by Julia Taro

import java.util.Scanner;

public class Ulessanne5 {

    public static void main(String[] args) {

        // Task 5.2


        for (int i = 1; i <= 3; i++) {
            System.out.println("Calling my method " + i + " time");
            myMethod();

        }

    }

    static void myMethod() {

        Scanner scanner = new Scanner(System.in); // user inputs
        System.out.print("Enter first positive number: ");
        int first = scanner.nextInt();

        if (first < 0) {
            System.out.print("Error. Number is negative, please enter positive number: ");
            first = scanner.nextInt();
        }

        System.out.print("Type second number: ");
        int second = scanner.nextInt();

        if (second < 0) {
            System.out.print("Error. Number is negative, please enter positive number: ");
            second = scanner.nextInt();
        }

        if (second == 0) {
            System.out.print("Error. Number could not be 0. Please enter a number: ");
            second = scanner.nextInt();
        }


        int result = first / second;

        System.out.println("result is: " + result);


    }

}





