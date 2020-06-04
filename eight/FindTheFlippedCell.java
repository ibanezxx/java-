package homework.eight;

import java.util.Scanner;

public class FindTheFlippedCell {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a 6-by-6 matrix row by row:");
        int[][] matrix =new int[6][6];

        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                matrix[i][j]=input.nextInt();
            }
        }

        System.out.println("The flipped cell is at("+findTheRow(matrix)+","+findTheColumn(matrix)+")");
    }
    public static int findTheRow(int[][] matrix){
        int countRow=0;
        int row=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if (matrix[i][j]==1)
                    countRow++;
            }
            if(countRow%2!=0){
                row=i;
                break;
            }
        }
        return row;
    }
    public static int findTheColumn(int[][] matrix){
        int countColumn=0;
        int column=0;

            for(int j=0;j<matrix[0].length;j++) {
                for (int i = 0; i < matrix.length; i++) {
                    if (matrix[i][j] == 1)
                        countColumn++;
                }
                if (countColumn % 2 != 0) {
                    column = j;
                    break;
                }
            }

        return column;
    }
}
