package Core;

import java.util.Scanner;

public class conditional_statement_if_else6B {
    public static void main(String[] args) {
//        user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your age : ");
        int age = sc.nextInt();
        sc.close();

        // if condition here
        if (age> 17)
        {
            System.out.println("You are adult bro");
        }

        else {
            System.out.println("You are minor dude ");
        }
    }

}
