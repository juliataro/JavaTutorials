package Ulessanne1;

import javax.sql.PooledConnection;
import java.awt.*;
import java.util.Date;
import java.util.Scanner;

public class Ulessanne7 {
    public static void main(String[] main) {
        // Creating the Scanner
        Scanner reader = new Scanner(System.in);

        // Declaring the variables and assigning user input to them
        int first = Integer.valueOf(reader.nextLine());
        int second = Integer.valueOf(reader.nextLine());

        // Identifying the operation and declaring a variable for the result
        int product = first * second;

        // Printing the result of the operation
        System.out.println("The product of " + first + " and " + second + " is " + product);

    }
}
