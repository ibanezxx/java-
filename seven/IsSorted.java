package homework.seven;

import java.util.Scanner;

public class IsSorted {
    //7.19
    public static void main(String[] args) {
        System.out.println("Enter list:");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int[] list=new int[number];

        for(int i=0;i<list.length;i++){
         list[i]=input.nextInt();
        }

        if(!isSorted(list)){
            System.out.println("The list is not sorted");
        }
        else System.out.println("The list is already sorted");

    }
    public static boolean isSorted(int[] list){
        for(int i=1;i<list.length;i++){
            if(list[i-1]>list[i]){
                return false;
            }
        }
        return true;

    }
}
