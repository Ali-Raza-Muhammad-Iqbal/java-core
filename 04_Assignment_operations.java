package Core;

public class Assignment_operations_4 {

//    Assignment operators are used to assign values to the variables
//    here are some assignment operators
//     = assignment operator
//    compound assignment operators
//    +=
//    -=
//    *=
//    /=
//    %=
//    --variable -- pre decrement variable-- post decrement --unary operator
//    ++variable -- pre increment variable++ post decrement --unary operator


    public static void main(String[] args) {
        int a = 10 , b=5 ;
        System.out.println("a ="+a +" b ="+b);
        a += b;
        System.out.println("addition assignment: "+ a);
        a-=b;
        System.out.println("subtraction assignment:"+a);
        a*=b;
        System.out.println("multiplication assignment:"+a);
        a/=b;
        System.out.println("division assignment:"+a);
        a%=b;
        System.out.println("modulus assignment:"+a);
        --a;
        System.out.println("Pre decrement:"+a);
        ++a;
        System.out.println("pre increment:"+a);
    }

}
