package homework.ten;

import java.util.Scanner;

public class ShowPrimeNumberFactors {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int num=input.nextInt();
        StackOfInteger stackOfInteger=new StackOfInteger();

        int i=2;
        while (i<=num) {
            if (num%i==0&&num/i!=0){
            stackOfInteger.push(i);
            num=num/i;
            }
            else i++;
        }

        while (!stackOfInteger.empty()){
            System.out.print(stackOfInteger.pop()+" ");
        }
    }
}
