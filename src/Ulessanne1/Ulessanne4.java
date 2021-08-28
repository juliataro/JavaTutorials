package Ulessanne1;

// Task 4 by Julia Taro

import com.sun.source.doctree.SystemPropertyTree;

/*
System.out.println(tekst.length()); //11
 System.out.println(tekst.charAt(0)); //L
 System.out.println(tekst.substring(1)); //orem iPsum
 System.out.println(tekst.substring(2,5)); //rem
 System.out.println(tekst.indexOf("m")); //4
 System.out.println(tekst.indexOf("m",5)); //10
 System.out.println(tekst.toLowerCase()); //lorem ipsum
 System.out.println(tekst.toUpperCase()); //LOREM IPSUM

 String[] tykeldus = tekst.split(" ");
 System.out.println(tykeldus[0]); //Lorem
*/

import java.util.Locale;
import java.util.Scanner;

public class Ulessanne4 {
    public static void main(String[] args){

        // Task 4.2
        Scanner scanner = new Scanner (System.in); // user inputs
        System.out.print("Type your name: ");
        String name = scanner.nextLine();
        System.out.print("Type your age: ");
        int age = scanner.nextInt();

        System.out.println("Hi "+name+", "+age+"!");
        // Task 4.3
        System.out.println("Hi " +name.toUpperCase(Locale.ROOT)); // Up to Uppercase

        // Task 4.4
        int length = String.valueOf(age).length(); // convert number to string
        System.out.println("The lenght of age number is: "+length); // count it

        // Task 4.5
        System.out.println("The length of name is: "+name.length()); // count name

        // Task 4.6
        String[] breakup = name.split(" "); // one method
        System.out.printf("%s\n",breakup[0]); // of splitting

        System.out.printf("%5.5s",name); // another method of splitting

    }
}
