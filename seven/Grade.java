package homework.seven;

import java.util.Arrays;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        char grade;
        Scanner input=new Scanner(System.in);

        System.out.println("请输入学生总数");
        int number=input.nextInt();

        System.out.println("请输入所有学生的分数");
        int[] score=new int[number];

        for(int i=0;i<number;i++){
        score[i]=input.nextInt();
        }

        int best=score[0];

        for(int i=1;i<number;i++){
            if(best<score[i]){
                best=score[i];
            }
        }
        for(int i=0;i<number;i++){
            if(score[i]>=best-10)
                grade='A';
            else if(score[i]>=best-20)
                grade='B';
            else if (score[i]>=best-30)
                grade='C';
            else if (score[i]>=best-40)
                grade='D';
            else grade='F';

        System.out.printf("Student %d score is %d and grade is %c\n",i,score[i],grade);
    }
    }
}
