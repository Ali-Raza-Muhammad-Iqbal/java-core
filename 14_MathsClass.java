package Core;

import java.sql.SQLOutput;

public class MathsClass15 {
    public static void main(String[] args) {
        // maths class is used to perform different mathematical functions

        // MAX FUNCTIONS
        System.out.println("max :"+Math.max(5,6)); // RETURNS THE MAXIMUM NUMBER

        //MIN FUNCTION
        System.out.println("min :"+Math.min(55,57));

        // random
        System.out.println("random number :"+Math.random()); // random function usually generates between 0-1 numbers

        // random function technique for generating greater than 1 number
        System.out.println("Greater than 1 number"+(int)(Math.random()*100)); // generates upto 100
    }
}
