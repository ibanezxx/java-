package homework.seven;

import java.util.Arrays;
import java.util.Scanner;

public class SortStudent {
    //7.17
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入学生个数");
        int numberOfStudent=input.nextInt();


        System.out.println("请输入学生姓名");
        String[] name=new String[numberOfStudent];
        for (int i=0;i<numberOfStudent;i++){
                name[i]=input.next();
        }


        System.out.println("请输入成绩");
        int[] score=new int[numberOfStudent];
        for(int i=0;i<numberOfStudent;i++){
                score[i]=input.nextInt();
        }


        int temp=0;
        String sTemp="";
        for(int i=1;i<numberOfStudent;i++){
            for(int j=0;j<numberOfStudent-i;j++) {
                if (score[j] < score[j+1]) {
                    temp = score[j];
                    score[j] = score[j+1];
                    score[j+1] = temp;

                    sTemp = name[j];
                    name[j] = name[j+1];
                    name[j+1] = sTemp;
                }
                else continue;
            }
        }
        for (int i=0;i<numberOfStudent;i++){
            System.out.println("第"+(i+1)+"名 "+name[i]+" "+score[i]);
        }
    }
}
