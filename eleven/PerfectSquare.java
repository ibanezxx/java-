package homework.eleven;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an integer m:");
        int m=input.nextInt();
        int n=2;
        while (Math.sqrt(m*n)%1!=0){
            n++;
        }
        System.out.println("The smallest number n for m*n to be a perfect square is "+n);
        System.out.println("m*n is "+m*n);
    }
}
