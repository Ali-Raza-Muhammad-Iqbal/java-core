package Core;

import java.util.Scanner;

public class conditional_statement_else_if_6c {
    public static void main(String[] args) {
//        user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your age :");
        int age = sc.nextInt();
        sc.close();

        // if condition here
        if (age> 17 && age<25)
        {
            System.out.println("You are adult bro");
        }
        else if (age>17 && age<35) {
            System.out.println("you are adult and young ");

        }

        else if (age>17 && age>35 && age<45){
            System.out.println("You are adult and mature in age ");

        }

        else if(age>17 && age>45){
            System.out.println("you are senior citizen bro ");
        }

        else
            System.out.println("you are minor broooo ");


    }
}
