package homework.eight;

import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        //8.1
        System.out.println("Enter a 3-by-4 matrix row by row:");
        Scanner input=new Scanner(System.in);
        double[][] matrix=new double[3][4];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=input.nextDouble();
            }
        }
        int columnIndex=0;
        for(int i=0;i<matrix[0].length;i++) {
            System.out.println("Sum of the elements at column " + columnIndex + " is " +sumColumn(matrix, columnIndex) );
            columnIndex++;
        }

        }

        public static double sumColumn(double[][] m,int columnIndex){
            double sum=0;
                for(int i=0;i<m.length;i++) {
                    sum+=m[i][columnIndex];
                }
            return sum;
        }
}