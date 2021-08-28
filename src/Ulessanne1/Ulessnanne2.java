package Ulessanne1;

// Task 2 done by Julia Taro

public class Ulessnanne2 {

    public static void main(String[] args){
        float a = 2.0f;
        int b = 3;
        float result;

        result = a / b;
        System.out.println(result);

        int x, y;
        float z;
        x = 7;
        y = 6;
        z = (float) x / y;

        System.out.println(z);


        // järgmine näide

        double c, d, e;
         //random number
        c = Math.random()*100;
        // rounding 2 numbers after comma
        d = Math.round(c*100.0)/100.0;
        //calculating power of number
        e = Math.pow(9,3);

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);


        // Task 2.1

        float k = convertion (40);
        System.out.println("2.1: 40 inches coverting into metres is  "+k);

        // Task 2.2
        float s = sqCalculation(3.2f,10);

        System.out.println("2.2: The square of oval is "+s);


        // Task 2.3
        float min = minsTohours(25);
        float sec = minsToseconds(25);
        System.out.println("2.3: 25 minutes in hours is "+min+"and in seconds is "+sec);

        // Task 2.4

        int speed1 = speedCalc1 (10,2);
        int speed2 = speedCalc2 (12,2);
        int diff = speeddiff(speed1, speed2);
        System.out.println("2.4: First sportsmen speed is "+speed1+" km/h seconds is "+speed2+" km/h difference is "+diff);

    }

        // ------------- Solving of tasks -------------

        // Task  2.1 solving, giving float as the result should be float, we have variable already given and here we give it a
        // name and create new variable for the result, then returning the result
        static float convertion (float k){
        float result = k * 2.54f;
        return result;
    }

    // Task  2.2 solving
    static  float sqCalculation(float l, float r){
        float square = Math.round((l*r*3.14f)*100.0f)/100.0f;
        return square;
    }

    //Task  2.3 solving

    static float minsTohours (float a){
        float min_result = a / 60;
        return  min_result;
    }

    static float minsToseconds (float b){
        float sec_result = b / 60;
        return  sec_result;
    }

    // Task 2.4 solving

        /*
        int speed1 = speedCalc1 (10,2);
        int speed2 = speedCalc (12,2);
        int diff = speeddiff();
        */
    static int speedCalc1(int i, int j) {
        int result1  = i / j;
        return result1;
    }
    static int speedCalc2(int e, int u) {
        int result2  = e / u;
        return result2;
    }

    static int speeddiff (int result1, int result2) {
        int difference = result2 - result1;
        return difference;
    }



}
