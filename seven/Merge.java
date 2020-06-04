package homework.seven;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {
    //7.31
    public static void main(String[] args) {
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

        for(int i=0;i<merge(list1,list2).length;i++)
            System.out.print(merge(list1,list2)[i]+" ");
    }

    public static int[] merge(int[] list1,int[] list2){
        int[] list3=new int[list1.length+list2.length];
        for(int i=0;i<list1.length;i++){
            list3[i]=list1[i];
        }
        for(int i=list1.length,j=0;i<list1.length+list2.length;i++,j++){
            if(j>list2.length)
                break;
            list3[i]=list2[j];
        }
        Arrays.sort(list3);
        return list3;
    }
}
