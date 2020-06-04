package homework.eight;

import java.util.Scanner;

public class MarkovMatrix {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double[][] matrix=new double[3][3];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=input.nextDouble();
            }
        }

        if (isMarkovMatrix(matrix))
            System.out.println("It is a Markov matrix");
        else System.out.println("It is not a Markov matrix");
    }
    public static boolean isMarkovMatrix(double[][] m){
        double sum=0;

        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                if (m[i][j]<0)
                    return false;
            }
        }
        for(int j=0;j<m[0].length;j++){
            for(int i=0;i<m.length;i++){
               sum+=m[i][j];
            }
            if (sum==1)
                return true;
        }
        return false;
    }
}
