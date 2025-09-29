package Core;

public class ExceptionHandling16 {
    public static void main(String[] args) {
//        In exception handling, an exception is an unexpected event or error that occurs during program execution and disrupts the normal flow of instructions.
//
//👉 Example: dividing by zero, accessing an invalid array index, or opening a missing file.
//
//        So simply:
//        Exception = runtime error/event that can be caught and handled to prevent program crash.
//        usually we use try catch for it

        try {
            int[] marks = {2,3,4,5};
            System.out.println("Length of array is : "+marks.length);
            System.out.println(marks[5]);

        }
        catch (Exception exception) {
            //do something over here
            System.out.println("something went wrong");
        }

        System.out.println("this statement runs if try catch works properly");




    }
}
