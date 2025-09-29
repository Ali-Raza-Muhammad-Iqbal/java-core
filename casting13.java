package Core;

public class casting13 {
    public static void main(String[] args) {
//        Casting is a proocess of conevrting one data to another type.
//                there are two types of casting
//                1. implicit // changing data to its closet Super set type (char to string/ int to double)
//                2. explicit // changing data to its opposite type (number to string)

//  implicit -- it is by default allowed we can do it without any extra chnages
    int price =100;
    float discount = 18.5f ;
    double finalPrice= price + discount;
        System.out.println("with Implicit casting:"+finalPrice);

//    explicit - it is not allowed by default - we have to cast it manually
    int FinalPrice = price + (int) discount;
        System.out.println("Explicit casting:"+FinalPrice);


    }
}
