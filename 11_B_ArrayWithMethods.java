package Core;

import java.util.Arrays;

public class ArrayWithMethods11 {
    public static void main(String[] args) {
        int[] marks = new int[5]; // basic method -if values are unknown


        marks[0] = 20;
        marks[1] = 10;
        marks[2] = 30;
        marks[3] = 60;
        marks[4] = 50;

//        int[] marks ={50 , 60 , 70 ,80; // if value are known

        // access elements - print in single line
        System.out.print("Marks[]: "+marks[0]+" "+marks[1]+" "+marks[2]+" "+marks[3]+" "+marks[4]+"\n");


        // using for loop
        System.out.println("access and print using FOR loop");
        for (int i=0 ;i <=marks.length-1;i++){
            System.out.print(marks[i]+ "");
        }

//        //using for each loop
//        for j in marks{
//            System.out.println(j);
//        }
//            length is property not a function,so we write it without small brackets
        System.out.println("Array length:"+marks.length);

//        // sorting
        Arrays.sort(marks);
        System.out.println("after sort method");
        for (int i=0 ;i <=marks.length-1;i++){
            System.out.print(marks[i]+" ");
        }


    }
}
