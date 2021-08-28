package Ulessanne1;

// Julia Taro Task 6

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ulessanne6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;
        char choice;
        int amount = 0;
        int average;


        do {
            System.out.println("Enter the Number: ");
            number = scanner.nextInt();

            System.out.println("Please enter Y for yes if you want to continue and N if not: ");
            choice = scanner.next().charAt(0);

            // Summing up the numbers
            sum = sum + number;


            // Counting of amount of numbers
            if (number > 0) {
                amount = amount + 1;
            }
            System.out.println(amount);


            // Counting of average number
            average = sum / amount;


            // Preparation of Array for saving
            int[] myArray = new int[amount];

            for (int i = 0; i < number; i++) {
                myArray[i] = scanner.nextInt();
            }


        } while ((choice == 'Y') || (choice == 'y'));

        // Display the total sum
        System.out.println("Total sum is: " + sum);
        System.out.println("Average number is: " + average);


        for (int i = 0; i < number; i++) ;
        System.out.println(myArray[i]);
        // Creating a new file

        try {
            File myObj = new File("JuliaTaroTask6.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Creating variable for file

        File myFail = new File("JuliaTaroTask6.txt");

        // Writing into File
        try {
            BufferedWriter bw = new BufferedWriter((new FileWriter(myFail)));

            bw.write(sum);
            bw.write(average);
            bw.close();
            System.out.println("Fail loodud");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

