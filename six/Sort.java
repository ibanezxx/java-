package homework.six;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        //6.5
        System.out.println("请输入三个数");
        Scanner input=new Scanner(System.in);
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        double num3=input.nextDouble();
        displaySortedNumbers(num1,num2,num3);
    }
    public static void displaySortedNumbers( double num1, double num2, double num3){
        double temp;
       if(num1>num2){
           temp=num1;
           num1=num2;
           num2=temp;
       }
       if(num1>num3) {
           temp = num1;
           num1 = num3;
           num3 = temp;
       }
       if(num2>num3){
           temp=num2;
           num2=num3;
           num3=temp;
       }
        System.out.printf("升序排列为%.2f %.2f %.2f",num1,num2,num3);
    }
}
