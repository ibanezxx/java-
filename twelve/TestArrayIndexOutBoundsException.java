package homework.twelve;

import java.util.Scanner;

public class TestArrayIndexOutBoundsException {
    public static void main(String[] args) {
        int[] nums=new int[100];
        for (int i=0;i<100;i++){
            nums[i]=(int)(Math.random()*100);
        }
        Scanner input=new Scanner(System.in);
        System.out.print("请输入数组下标:");
        int index = input.nextInt();
        try {
            System.out.println(nums[index]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Out Of Bounds");
        }

    }
}
