package homework.seven;

import java.util.Scanner;

public class RemoveDuplicates {
    //7.15
    public static void main(String[] args) {
        System.out.println("Enter ten numbers:");
        Scanner input=new Scanner(System.in);
        int[] num=new int[10];
        for(int i=0;i<num.length;i++){
            num[i]=input.nextInt();
        }
        System.out.print("The distinct numbers are:");
        int[] num2=eliminateDuplicates(num);
        for(int i=0;i<num2.length;i++){
            System.out.print(num2[i]+" ");
        }

    }

    public static int[] eliminateDuplicates(int[] list){
        int[] temp=new int[list.length];
        int length=0;

        for (int i = 0; i < list.length; i++) {
            boolean duplicates = false;
            for (int j = 0; j < i ; j++)
                if (list[j] == list[i]) {
                duplicates = true;
            }

            if (!duplicates) {
                temp[length] = list[i];
                length++;
            }
        }

        int[] num0 = new int[length];
        for (int i = 0; i < length; i++)
            num0[i] =temp[i];

        return num0;
    }
}
