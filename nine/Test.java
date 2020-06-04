package homework.nine;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array:");
        int row=input.nextInt();
        int column=input.nextInt();
        double[][] array=new double[row][column];

        System.out.println("Enter the array");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]=input.nextDouble();
            }
        }
        //创建一个Location对象储存locateLargest方法的返回值
        Location location=locateLargest(array);
        System.out.println("The location of the largest element is " + location.maxValue + " at (" + location.row + ", " + location.column + ")");
    }
    public static Location locateLargest(double[][] a){
        Location location=new Location();
        location.maxValue=a[0][0];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if (location.maxValue<a[i][j]){
                    location.maxValue=a[i][j];
                    location.row=i;
                    location.column=j;
                }

            }
        }
        return location;
    }
    }



