package Core;

import java.util.Scanner;

public class Switch_statement_7 {
    public static void main(String[] args) {
        int a , b;
        char operator;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b= sc.nextInt();
        System.out.println("Please enter the operator + ,- , / , % etc");
        // AS INPUT CASTING TO CHAR IS NOT POSSIBLE SO WE TAKE INPUT AS A STRING AND THEN CAST
        // IT INTO CHAR USING INDEXING OF STRING
        String charOP = sc.next();
        operator = charOP.charAt(0);

        // now apply switch statement

        switch (operator) {
            case '+':
                System.out.println(a+b);
            break;

            case '-':
                System.out.println(a-b);
                break;

            case '*':
                System.out.println(a*b);
                break;

            case '/':
                System.out.println(a/b);
                break;

            case '%':
                System.out.println(a%b);
                break;


            default:
                System.out.println("Please enter a valid input");
        }




    }
}
