package homework.eight;

import java.util.Scanner;

public class MaxSquare_undone {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of rows int the matrix:");
        int rows=input.nextInt();
        System.out.println("\nEnter the matrix row by row:");
        int[][] matrix=new int[rows][rows];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=input.nextInt();
            }
        }

    }
    public static int[] findLargestBlock(int[][] m){
return null;
    }
}
