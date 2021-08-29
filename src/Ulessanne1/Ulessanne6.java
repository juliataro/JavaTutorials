package Ulessanne1;

// Julia Taro Task 6, ne rabotala zapis array

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
        int i;


        do {

            // Asking number from user


            System.out.println("Enter the Number: ");
            number  = scanner.nextInt();

            // Asking if user agree to continue
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


        } while ((choice == 'Y') || (choice == 'y'));

        // Display the total sum
        System.out.println("Total sum is: " + sum);
        System.out.println("Average number is: " + average);// Creating variable for file


        File myFail = new File("JuliaTaroTask6.txt");

        // Writing into File
        try {
            BufferedWriter bw = new BufferedWriter((new FileWriter(myFail)));

            bw.write("Total sum is: " + sum + " ");
            bw.write("Average number is: " + average);
            bw.close();
            System.out.println("Fail loodud");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

