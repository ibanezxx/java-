package homework.eight;

import javax.xml.stream.XMLInputFactory;
import java.util.Scanner;

public class FindTheMax {
    //8.13
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array:");
        int rows = input.nextInt();
        int columns = input.nextInt();
        System.out.println();
        System.out.println("Enter the array:");
        double[][] array = new double[rows][columns];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        int[] largestLocation=locateLargest(array);
        System.out.println("The location of the largest element is at ("+largestLocation[0]+","+largestLocation[1]+")");
    }

    public static int[] locateLargest(double[][] a) {
        int[] max = new int[2];

        double largest=a[0][0];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(largest<a[i][j]){
                    largest=a[i][j];
                    max[0]=i;
                    max[1]=j;
                }
            }
        }


        return max;
        }
}
