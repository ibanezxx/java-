package homework.oneToFive;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Homeworkfive {
    //  5.1
//  public class Count{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int positiveNumber = 0;
//        int negetiveNumber = 0;
//        double total = 0;
//        double average = 0;
//        int num = 1;
//        while (num != 0) {
//            num = input.nextInt();
//            if (num > 0) {
//                positiveNumber++;
//            } else if (num < 0) {
//                negetiveNumber++;
//            }
//            total += num;
//        }
//        average = total / (positiveNumber + negetiveNumber);
//        System.out.printf("正数有%d个，负数有%d个，总共%.0f个整数，平均值%.2f", positiveNumber, negetiveNumber, total, average);
//    }
    //5.3
//    public class Kilogramsintopounds{
//        public static void main(String[] args) {
//    int kilogram=1;
//    double pound=2.2;
//    System.out.println("千克"+"          "+"磅");
//    while (kilogram<200) {
//        pound = kilogram * 2.2;
//        System.out.println(kilogram + "            " + pound);
//        kilogram += 2;
//    }
//}
    //5.5
//    public class Kilogramsinterchangeablewithpounds{
//    public static void main(String[] args) {
//    int kilogram=1;
//    double kilogramToPound=2.2;
//    int pound=20;
//    double poundToKilogram=9.09;
//    System.out.println("千克            磅            千克             磅");
//    while (kilogram<200) {
//        kilogramToPound = kilogram * 2.2;
//        poundToKilogram = pound / 2.2;
//        System.out.printf("%d            %.1f            %d            %.2f\n", kilogram, kilogramToPound, pound, poundToKilogram);
//        kilogram += 2;
//        pound += 5;
//    }
//}
    //5.7
//    public class Calculatingtuitionfees{
//    public static void main(String[] args) {
//    double feesInThisYear=10000;
//    double feesInTenYears=0;
//    double totalFeesInFourYears=0;
//    double rate=0.05;
//    int years=1;
//    while (years<10){
//        feesInThisYear=feesInThisYear*(1+rate);
//        feesInTenYears=feesInThisYear;
//        years++;
//    }
//    System.out.println("十年后的学费为："+feesInTenYears+"$");
//    while (years<14){
//        feesInTenYears=feesInTenYears*(1+0.05);
//        totalFeesInFourYears+=feesInTenYears;
//        years++;
//    }
//    System.out.println("十年后算起的4年内的总学费为："+totalFeesInFourYears);
//}
    //5.9
//public class Thetwohighest{
//public static void main(String[] args) {
//    System.out.println("请输入学生个数");
//    Scanner input=new Scanner(System.in);
//    int theNumberOfStudent=input.nextInt();
//    String name=new String();
//    String theFirst=new String();
//    String theSecond=new String();
//    int score=0,max=0,theSecondMax=0;
//    while (theNumberOfStudent>0) {
//        System.out.println("请输入学生姓名");
//        name=input.next();
//        System.out.println("请输入学生成绩");
//        score=input.nextInt();
//        if(score>max){
//            theSecondMax=max;
//            theSecond=theFirst;
//            max=score;
//            theFirst=name;
//        }
//        else if(score>theSecondMax&&score<max){
//        theSecondMax=score;
//        theSecond=name;
//        }
//        theNumberOfStudent--;
//    }
//    System.out.println("第一名是:"+theFirst+"   "+max+"分");
//    System.out.println("第二名是:"+theSecond+"   "+theSecondMax+"分");
//}

    //5.11
//    public class Findthenumber{
//    public static void main(String[] args) {
//        int j = 0;
//        for (int i = 100; i < 201; i++) {
//            if (i % 5 == 0 && i % 6 != 0) {
//                System.out.print(i + " ");
//                j++;
//                if (j % 10 == 0) {
//                    System.out.println();
//                }
//            } else if (i % 6 == 0 && i % 5 != 0) {
//                System.out.print(i + " ");
//                j++;
//                if (j % 10 == 0) {
//                    System.out.println();
//                }
//            }
//
//        }
//    }
    //5.13
//    public class Findthemax{
//    public static void main(String[] args) {
//        int n=1;
//        int temp=0;
//        while (Math.pow(n,3)<12000){
//            temp=n;
//            n++;
//        }
//        System.out.println("三次方小于12000最大整数为："+temp);
//    }
    //5.15
    //! 33 ~126
//    public class Printtheascii{
//    public static void main(String[] args) {
//        char ch=33;
//        int j=0;
//        for(int i=33;i<127;i++){
//            System.out.print(ch+" ");
//            ch+=1;
//            j++;
//            if(j%10==0){
//                System.out.println();
//            }
//        }
//    }
    //5.17
//    public class Printpyramid{
//    public static void main(String[] args) {
//        System.out.println("请输入一个1到15之间的整数");
//        Scanner input=new Scanner(System.in);
//        int n=input.nextInt();
//        int i = 1,m = 1;
//        int s = 2,k = 1;
//        for(m = 1;m<=n;m++){
//            for (k=1;k<=(n-m);k++)
//                System.out.print(" ");
//            //循环输出n-m空格
//            for(i=m;i>=1;i--)System.out.print(i);
//            // 输出i,i-1,..1
//            for(s=2;s<=m;s++)System.out.print(s);
//            // 输出2,3,...,m
//            for(k=1;k<=n-m;k++)System.out.print(" ");
//            // 输出n-m个空格
//            System.out.print("\n");
//        }
//
//        }
    //5.19
//    public class Printpyramidtwo{
//    public static void main(String[] args) {
//        System.out.println("请输入一个1到15之间的整数");
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int i = 1, m = 1;
//        int s = 2, k = 1;
//        for (m = 1; m <= n; m++) {
//            for (k = 1; k <= (n - m); k++)
//                System.out.print(" ");
//            //循环输出n-m空格
//            for (s = 1; s <= m; s++) System.out.print(s);
//            // 输出1,2,3,...,m
//            for (i = m-1; i >= 1; i--) System.out.print(i);
//            // 输出i,i-1,..1
//            for (k = 1; k <= n - m; k++) System.out.print(" ");
//            // 输出n-m个空格
//            System.out.print("\n");
//        }
//
//    }
//
}
