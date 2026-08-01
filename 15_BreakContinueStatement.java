package Core;

public class BreakContinueStatement15 {
    public static void main(String[] args) {
//        break and continue statements are used as skip statements
//                1. break -- breakes the overall flow of program
//                2. continue --skips the current iteration
//


        // break
        System.out.println("break");
        for(int i =0; i<10; i++){
            System.out.print(i+" ");
            if(i==6){
                break;
            }
        }
        System.out.println();

        // continue
        System.out.println("continue");
        for(int i =0; i<10; i++){
            System.out.print(i+" ");
            if(i==6) {
                i=i+1;
                continue;
            }
        }

    }
}
