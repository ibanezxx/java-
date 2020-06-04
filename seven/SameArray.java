package homework.seven;

import java.util.Arrays;
import java.util.Scanner;

public class SameArray {
    public static void main(String[] args) {
        //7.27
        Scanner input=new Scanner(System.in);
        System.out.print("Enter list1:");
        int length1=input.nextInt();
        int[] list1=new int[length1];
        for(int i=0;i<list1.length;i++){
            list1[i]=input.nextInt();
        }

        System.out.print("\nEnter list2:");
        int length2=input.nextInt();
        int[] list2=new int[length2];
        for(int i=0;i<list2.length;i++){
            list2[i]=input.nextInt();
        }

        if(equals(list1,list2)){
            System.out.println("Two lists are identical");
        }
        else System.out.println("TWo lists are not identical");
    }
    public static boolean equals(int[] list1,int[] list2){
        if(list1.length!=list2.length)
            return false;
        Arrays.sort(list1);
        Arrays.sort(list2);
        for(int i=0;i<list1.length;i++){
            if(list1[i]!=list2[i])
                return false;
        }
        return true;
    }
}
