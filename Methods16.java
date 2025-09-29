package Core;




public class Methods16 {

//    a method is a block of code that performs a specific task.
//
//    It is similar to a function in other languages.
//
//    Methods allow code reusability, organization, and modularity.

    public static void sayHello(){
        System.out.println("Hello !");
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int subtract(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
    sayHello();

        System.out.println(add(20,30));
        System.out.println(subtract(20,30));
    }
}
