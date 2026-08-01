package Core;

import java.util.Scanner;

public class Scan_input_1B {
    public static void main(String[] args) {
//        The scanner class is used to take input from users and store in any particular variable or collection
    Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age ::");
        int age = sc.nextInt();
        sc.close();

        System.out.println("Your age is: "+age);

    }
}
