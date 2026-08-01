package Core;

public class TwoDimensionalArrays12 {
    public static void main(String[] args) {
        int[][] matrix = {{10,20,30,40},{50,60,70,80}};
//        printing the whole matrix -using nested for loop
        int row = 2, col=4;
        for (int i=0; i<row; i++){
            for (int j= 0; j<col; j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
    }
}
