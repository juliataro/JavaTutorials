package Ulessanne1;

// Task 3 done by Julia Taro

public class Ulessanne3 {
    public static void main(String[] args) {

        //  ------------  Task 3.1  --------------

        int[] numbers = {12,5,10,10,28,17,5,19,0,13,0,22,7,0,17,2,24,1,13,29,0,7,16,8,7,4,27,8,8,23,26,25,15,2,26,1};

        // 3.1 first element
        System.out.println("First element is " +numbers[0]);

        int countNumbers = numbers.length;
        int lastnumber = numbers[countNumbers-1];
        System.out.println("Last number of array is " +lastnumber); // the last element
        System.out.println("Number of elements in array " +countNumbers); // the last element

        for(int i=0; i< numbers.length; i++){  // displays all elements of array
            System.out.print( +numbers[i]+", ");
        }

        int total = 0; // Displays the summ of elements
        for (int i=0; i<numbers.length; i++){
        total += numbers[i];
        }
        System.out.println("Total sum is "+total);

        int kokku = 0; // Displays the average of elements
        for (int z=0; z<numbers.length; z++){
            kokku += numbers[z];
        }
        int average = total / numbers.length;
        System.out.println("Average of elements "+average);

        // --------------- Task 2 ----------

        int [][] mitmemot = {{1,23},{2,15},{3,29},{4,15},{5,26},{6,17},{7,26},{8,15},{9,28},{10,12},{11,24},{12,16},{13,21},{14,10},{15,10},{16,26},{17,27},{18,19},{19,14},{20,14},{21,14},{22,26},{23,20},{24,28},{25,29},{26,11},{27,28},{28,19},{29,25},{30,12}};

//käime läbi read
        for (int i = 0; i < mitmemot.length; i++) {

                System.out.print(mitmemot[i][1]+", ");
            }


    }
}
