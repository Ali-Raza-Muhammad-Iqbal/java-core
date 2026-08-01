package Core;

public class StringsWithMethods10 {
    public static void main(String[] args) {

        String FirstName = new String( "ali"); // can be direclty assigned without new keyword
        String LastName = " Raza";

        //methods for strings

//        1. length()
        System.out.println("String.length()");
        System.out.println( FirstName.length());
        System.out.println( LastName.length());

//        2. charAt
        System.out.println("charAt");
        System.out.println(FirstName.charAt(2));
        System.out.println(LastName.charAt(2));

//        3. concatination
        System.out.println("concatination");
        String FullName = FirstName + LastName ;
        System.out.println(FullName);

//        4. Replace
        System.out.println("Replace");
        System.out.println(FullName.replace("a","b"));

//        5. Substring
        System.out.println("Substring");
        System.out.println(FullName.substring(0,3));

//        6. toLowerCase
        System.out.println("toLowerCase");
        System.out.println(FullName.toLowerCase());

        //        7. toUpperCase
        System.out.println("toLowerCase");
        System.out.println(FullName.toUpperCase());





    }
}
