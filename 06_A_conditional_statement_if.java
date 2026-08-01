package Core;

import java.util.Scanner;

public class conditional_statement_if6A {
    public static void main(String[] args) {

//        user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your age :");
        int age = sc.nextInt();
        sc.close();

        // if condition here
        if (age> 17)
        {
            System.out.println("You are adult bro");
        }

    }
}
