package homework.seven;

import java.util.Scanner;

public class CalculatingStandardDeviation {
    public static void main(String[] args) {
        System.out.println("Enter ten numbers:");
        Scanner input=new Scanner(System.in);
        double[] num=new double[10];
        for(int i=0;i<10;i++){
         num[i]=input.nextDouble();
        }
        System.out.printf("The mean is %.2f\n",mean(num));
        System.out.printf("The standard deviation is %.5f",deviation(num));
    }
    public static double deviation(double[] x){
        double deviation=0;
        double sum=0;
        for(int i=0;i<x.length;i++){
            sum+=Math.pow(x[i]-mean(x),2);
        }
        deviation=Math.sqrt(sum/(x.length-1));
        return deviation;
    }
    public static double mean(double[] x){
        double mean=0;
        double sum=0;
        for(int i=0;i<x.length;i++){
            sum+=x[i];
        }
        mean=sum/x.length;
        return mean;
    }
}
