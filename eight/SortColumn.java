package homework.eight;

import java.util.Arrays;
import java.util.Scanner;

public class SortColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double[][] matrix = new double[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        double[][] m=sortColumn(matrix);
        System.out.println("The column-sorted array is");
        int count=0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]+" ");
                count++;
            }
            if (count%3==0)
                System.out.println();
        }
    }

    public static double[][] sortColumn(double[][] m) {
        double temp=0;
        for (int j = 0; j < m[0].length; j++) {

            for (int k=0;k<m.length-1;k++) {
                for (int i = 0; i < m.length - 1 - k; i++) {
                    if (m[i][j] > m[i + 1][j]) {
                        temp = m[i][j];
                        m[i][j] = m[i + 1][j];
                        m[i + 1][j] = temp;
                    }
                }
            }

        }
        return m;
    }
}
