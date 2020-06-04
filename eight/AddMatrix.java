package homework.eight;

import java.util.Scanner;

public class AddMatrix {
    //8.5
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter matrix1:");
        double[][] matrix1=new double[3][3];
        for(int i=0;i<matrix1.length;i++){
            for (int j=0;j<matrix1[i].length;j++){
                matrix1[i][j]=input.nextDouble();
            }
        }

        System.out.print("\nEnter matrix2:");
        double[][] matrix2=new double[3][3];
        for(int i=0;i<matrix2.length;i++){
            for (int j=0;j<matrix2[i].length;j++){
                matrix2[i][j]=input.nextDouble();
            }
        }

        System.out.println("The matrices are added as follows");
        double[][] matrix=addMatrix(matrix1,matrix2);
        System.out.println(matrix1[0][0]+" "+matrix1[0][1]+" "+matrix1[0][2]+"    "
                          +matrix2[0][0]+" "+matrix2[0][1]+" "+matrix2[0][2]+"    "
                          +matrix[0][0]+" "+matrix[0][1]+" "+matrix[0][2]);
        System.out.println(matrix1[1][0]+" "+matrix1[1][1]+" "+matrix1[1][2]+" +  "
                +matrix2[1][0]+" "+matrix2[1][1]+" "+matrix2[1][2]+" =  "
                +matrix[1][0]+" "+matrix[1][1]+" "+matrix[1][2]);
        System.out.println(matrix1[2][0]+" "+matrix1[2][1]+" "+matrix1[2][2]+"    "
                +matrix2[2][0]+" "+matrix2[2][1]+" "+matrix2[2][2]+"    "
                +matrix[2][0]+" "+matrix[2][1]+" "+matrix[2][2]);
    }

    public static double[][] addMatrix(double[][] a,double[][] b){
        double[][] matrix=new double[3][3];
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                matrix[i][j]=a[i][j]+b[i][j];
            }
        }
        return matrix;
    }
}
