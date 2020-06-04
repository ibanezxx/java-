package homework.seven;

import java.util.Scanner;

public class PrintDifferentNumber {
    public static void main(String[] args){
        System.out.println("Enter ten numbers：");
        Scanner input=new Scanner(System.in);
        int theDistinctNumber=0;
        int[] num=new int[10];
        int number;

        for(int i=0;i<num.length;i++){
            number=input.nextInt();
            boolean distinct=true;
            //判断输入的数字是否已有相同的
            for(int j=0;j<theDistinctNumber;j++){
                if(number==num[j]){
                    distinct=false;
                }
            }
            if(distinct){
                num[theDistinctNumber]=number;
                theDistinctNumber++;
            }
        }
        System.out.println("The number of distinct values is "+theDistinctNumber);
        System.out.print("The distinct numbers are:");
        for (int i = 0; i < theDistinctNumber; i++)
            System.out.print(num[i] + " ");
    }

}
