package homework.six;

import java.util.Scanner;

public class Matrix {
    //6.17
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        printMatrix(n);
    }
    public static void printMatrix(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print((int)Math.random()*2+" ");
            }
            System.out.print("\n");
        }
    }
}
