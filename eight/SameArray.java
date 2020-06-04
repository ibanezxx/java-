package homework.eight;

import javax.management.StandardEmitterMBean;
import java.util.Arrays;
import java.util.Scanner;

public class SameArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter list1:");
        int[][] list1=new int[3][3];
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list1[i].length;j++){
                list1[i][j]=input.nextInt();
            }
        }

        System.out.print("\nEnter list2:");
        int[][] list2=new int[3][3];
        for(int i=0;i<list2.length;i++){
            for(int j=0;j<list2[i].length;j++){
                list2[i][j]=input.nextInt();
            }
        }

        if (equals(list1,list2))
            System.out.println("The two arrays are identical");
        else System.out.println("The two arrays are not identical");
    }
    public static boolean equals(int[][] m1,int[][] m2){
        int[] list1=new int[m1.length*m1[0].length];
        int[] list2=new int[m2.length*m2[0].length];

        int k=0;
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                list1[k]=m1[i][j];
                k++;
            }
        }
        k=0;
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
            list2[k]=m2[i][j];
            k++;
            }
        }
        Arrays.sort(list1);
        Arrays.sort(list2);
        for(int i=0;i<list1.length;i++){
                if (list1[i]!=list2[i])
                    return false;
            }

        return true;
    }
}
