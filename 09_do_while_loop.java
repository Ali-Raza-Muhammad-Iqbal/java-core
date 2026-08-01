package Core;

public class do_while_loop_9 {
    public static void main(String[] args) {
        // do while executes before checking the condition // at least one time
        //irrespective of condition which is passed to while
        int i =1;
        do {
            System.out.println("hello world"+i);
            i++;
        }
        while(i < 3);
    }
}
