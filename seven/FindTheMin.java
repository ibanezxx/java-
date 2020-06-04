package homework.seven;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheMin {
    public static void main(String[] args) {
        System.out.println("Enter ten numbers:");
        Scanner input=new Scanner(System.in);
        double[] num=new double[10];
        for(int i=0;i<10;i++){
            num[i]=input.nextDouble();
        }
        System.out.println("The minimum number is:"+min(num));
    }
    public static double min(double[] array){
        Arrays.sort(array);
        return array[0];
    }
}
