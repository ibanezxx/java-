package homework.thirteen;

import java.util.Scanner;

public class Vertex {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a b c:");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();

        String h=-b+"/"+2*a;
        String k=(4*a*c-b*b)+"/"+4*a;

        System.out.println("h is "+h+" k is "+k);
    }
}
