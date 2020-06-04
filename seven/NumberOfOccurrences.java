package homework.seven;

import java.util.Scanner;

public class NumberOfOccurrences {
        public static void main (String[] args) {
        System.out.println("请输入1到100之间的整数");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int[] times=new int[100];
        while(number!=0){
            if(number>=0&&number<=100){
                times[number-1]++;
            }
            number=input.nextInt();
        }

        for(int i=0;i<100;i++){
            if(times[i]==1)
            System.out.println((i+1)+" occurs "+times[i]+" time");
            else if(times[i]>1)
                System.out.println((i+1)+" occurs "+times[i]+" times");

        }
    }
}
