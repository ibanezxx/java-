package homework.six;

import java.util.Scanner;

public class Pentadecimal {
    public static void main(String[] args) {
        //6.1
    for(int i=1;i<=100;i++){
        System.out.printf("%10d",getPentagonalNumber(i));
        if(i%10==0)
        System.out.println();
    }
    }
    public static int getPentagonalNumber(int n){
        int pentadecimal=n*(3*n-1)/2;
        return pentadecimal;
    }
}
