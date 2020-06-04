package homework.oneToFive;

import java.util.Scanner;

public class Homeworkthree {
//    3.1
//    public static void main(String[] args) {
//        System.out.println("请输入a,b,c的值");
//        Scanner input=new Scanner(System.in);
//        double a=input.nextInt();
//        double b=input.nextInt();
//        double c=input.nextInt();
//        double delta=Math.pow(b,2)-4*a*c;
//        double r1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
//        double r2=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
//        if(delta>0){
//            System.out.println(r1+" "+r2);
//        }
//        else if(delta==0){
//            System.out.println("r1=r2="+r1);
//        }
//        else {
//            System.out.println("方程无实根");
//        }
//
//    }
//    3.3
//    public static void main(String[] args) {
//        System.out.println("请输入a,b,c,d,e,f");
//        Scanner input=new Scanner(System.in);
//        double a=input.nextDouble();
//        double b=input.nextDouble();
//        double c=input.nextDouble();
//        double d=input.nextDouble();
//        double e=input.nextDouble();
//        double f=input.nextDouble();
//        double x=(e*d-b*f)/(a*d-b*c);
//        double y=(a*f-e*c)/(a*d-b*c);
//        if(a*d-b*c==0){
//            System.out.println("The equation has no solution");
//        }
//        else {
//            System.out.println("x="+x+" "+"y="+y);
//        }
//
//    }
//    3.5
//    public static void main(String[] args) {
//        System.out.println("请输入今天的日期数字");
//        Scanner input=new Scanner(System.in);
//        int todaysNumber=input.nextInt();
//        String today=new String();
//        System.out.println("输入一个今天之后的天数");
//        int futureDayNumber=input.nextInt();
//        String futureDay=new String();
//        int future=(futureDayNumber+todaysNumber)%7;
//        switch (todaysNumber){
//            case 1:
//                today="Monday";
//                break;
//            case 2:
//                today="Tuesday";
//                break;
//            case 3:
//                today="Wednsday";
//                break;
//            case 4:
//                today="Thursday";
//                break;
//            case 5:
//                today="Friday";
//                break;
//            case 6:
//                today="Saturday";
//                break;
//            case 0:today="Sunday";
//                break;
//            default:
//                System.out.println("请输入一个不小于0且不大于6的数字");
//                break;
//        }
//
//            switch (future) {
//                case 0:
//                    futureDay = "Sunday";
//                    break;
//                case 1:
//                    futureDay = "Monday";
//                    break;
//                case 2:futureDay="Tuesday";
//                    break;
//                case 3:futureDay="Wednsday";
//                    break;
//                case 4:futureDay="Thursday";
//                    break;
//                case 5:futureDay="Friday";
//                    break;
//                case 6:futureDay="Saturday";
//                    break;
//                default:break;
//            }
//        System.out.printf("今天是%s,第%d天过后是%s",today,futureDayNumber,futureDay);
//}
//
//    3.7
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.print("Enter an amount in double,for example 11.56:");
//        double amount=input.nextDouble();
//        int remainingAmount =(int)(amount*100);
//        int numberOfOneDollars=remainingAmount/100;
//        remainingAmount=remainingAmount%100;
//
//        int numberOdQuarters=remainingAmount/25;
//        remainingAmount=remainingAmount%25;
//
//        int numberOfDimes=remainingAmount/10;
//        remainingAmount=remainingAmount%10;
//
//        int numberOfNickels=remainingAmount/5;
//        remainingAmount=remainingAmount%5;
//
//        int numberOfPennies=remainingAmount;
//
//        System.out.println("Your amount:"+amount+"consists of");
//
//        if(numberOfOneDollars>0){
//            if(numberOfOneDollars==1) {
//                System.out.println("    " + numberOfOneDollars + "dollar");
//            }
//            else {
//                System.out.println("    " + numberOfOneDollars + "dollars");
//            }
//        }
//
//        if(numberOdQuarters>0){
//            if(numberOdQuarters==1) {
//                System.out.println("    " + numberOdQuarters + "quarter");
//            }
//            else {
//                System.out.println("    " + numberOdQuarters + "quarters");
//            }
//        }
//
//        if(numberOfDimes>0){
//            if(numberOfDimes==1) {
//                System.out.println("    " + numberOfDimes + "dime");
//            }
//            else {
//                System.out.println("    " + numberOfDimes + "dimes");
//            }
//
//        }
//
//        if(numberOfNickels>0){
//            if(numberOfNickels==1) {
//                System.out.println("    " + numberOfNickels + "nickel");
//            }
//            else {
//                System.out.println("    " + numberOfNickels + "nickels");
//            }
//
//        }
//
//        if(numberOfPennies>0){
//            if(numberOfPennies==1) {
//                System.out.println("    " + numberOfPennies + "pennie");
//            }
//            else {
//                System.out.println("    " + numberOfPennies + "pennies");
//            }
//        }
//
//
//    }
//
//
//    3.9
//    public static void main(String[] args) {
//        System.out.println("请输入9个数");
//        Scanner input=new Scanner(System.in);
//        int d1=input.nextInt();
//        int d2=input.nextInt();
//        int d3=input.nextInt();
//        int d4=input.nextInt();
//        int d5=input.nextInt();
//        int d6=input.nextInt();
//        int d7=input.nextInt();
//        int d8=input.nextInt();
//        int d9=input.nextInt();
//        System.out.println(" ");
//        int d10=(d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
//        if(d10==10){
//            System.out.printf("%d%d%d%d%d%d%d%d%dX",d1,d2,d3,d4,d5,d6,d7,d8,d9);
//        }
//        else {System.out.printf("%d%d%d%d%d%d%d%d%d%d",d1,d2,d3,d4,d5,d6,d7,d8,d9,d10);}
//    }
//    3.11
//    public static void main(String[] args) {
//        System.out.println("请输入月份和年份");
//        Scanner input=new Scanner(System.in);
//        int month=input.nextInt();
//        int year=input.nextInt();
//        int day=0;
//        switch (month){
//            case 1:day=31;
//                break;
//            case 3:day=31;
//                break;
//            case 5:day=31;
//                break;
//            case 7:day=31;
//                break;
//            case 8:day=31;
//                break;
//            case 10:day=31;
//                break;
//            case 12:day=31;
//                break;
//            case 4:day=31;
//                break;
//            case 6:day=31;
//                break;
//            case 9:day=31;
//                break;
//            case 11:day=31;
//                break;
//            default:if(year%4==0||year%400==0){
//                    day=29;
//            }
//            else {
//                day = 28;
//            }
//                    }
//        System.out.printf("%d年的%d月有%d天",year,month,day);
//    }
//    3.13
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("(0-single filer,1-married jointly or"+"qualifying widow(er),\n2-married separately,3-head of"+"household)Enter the filing status");
//
//        int status=input.nextInt();
//
//        System.out.print("Enter the taxable income:");
//        double income=input.nextDouble();
//
//        double tax=0;
//
//        if(status==0) {
//            if (income <= 8350)
//                tax = income * 0.10;
//            else if (income <= 33950)
//                tax = 8350 * 0.10 + (income - 8350) * 0.15;
//            else if (income <= 82250)
//                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
//            else if (income <= 171550)
//                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28 + (income - 171550) * 0.33;
//            else if(income<=372950)
//                tax=8350*0.10+(33950-8350)*0.15+(82250-33950)*0.25+(171550-82250)*0.28+(income-171550)*0.33;
//            else
//                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
//        }
//        else if(status==1){
//            if (income <= 16700)
//                tax = income * 0.10;
//            else if (income <= 67900)
//                tax = 16700* 0.10 + (income - 16700) * 0.15;
//            else if (income <=137050)
//                tax = 16700* 0.10 + (67900 - 16700) * 0.15+(income-67900)*0.25;
//            else if (income <= 208850)
//                tax =16700* 0.10 + (67900 - 16700) * 0.15+(137050-67900)*0.25+(income-137050)*0.28;
//            else if(income <= 372950)
//                tax =16700* 0.10 + (67900 - 16700) * 0.15+(137050-67900)*0.25+(208850-137050)*0.28+(income-208850)*0.33;
//            else
//                tax =16700* 0.10 + (67900 - 16700) * 0.15+(137050-67900)*0.25+(208850-137050)*0.28+(372950-208850)*0.33+(income-372950)*0.35;
//
//        }
//        else if(status==2){
//            if (income <= 8350)
//                tax = income * 0.10;
//            else if (income <= 33950)
//                tax = 8350 * 0.10 + (income - 8350) * 0.15;
//            else if (income <= 68525)
//                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
//            else if (income <= 104425)
//                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + ( 104425- 82250) * 0.28;
//            else if(income<=186475)
//                tax=8350*0.10+(33950-8350)*0.15+(68525-33950)*0.25+(104425-82250)*0.28+(income-104425)*0.33;
//            else
//                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25+(104425-82250)*0.28+(186475-104425)*0.33+(income-186475)*0.35;
//        }
//        else if(status==3){
//            if (income <= 11950)
//                tax = income * 0.10;
//            else if (income <= 45500)
//                tax = 11950* 0.10 + (income -11950) * 0.15;
//            else if (income <=117450)
//                tax =11950* 0.10 + (45500 - 11950) * 0.15+(income-45500)*0.25;
//            else if (income <= 190200)
//                tax =11950* 0.10 + (45500 - 11950) * 0.15+(117450-45500)*0.25+(income-117450)*0.28;
//            else if(income <= 372950)
//                tax =11950* 0.10 + (45500 - 11950) * 0.15+(117450-45500)*0.25+(190200-117450)*0.28+(income-190200)*0.33;
//            else
//                tax =11950* 0.10 + (45500 - 11950) * 0.15+(117450-45500)*0.25+(190200-117450)*0.28+(372950-190200)*0.33+(income-372950)*0.35;
//
//        }
//        else {
//            System.out.println("Error:invalid status");
//            System.exit(1);
//        }
//        System.out.println("Tax is"+(int)(tax*100)/100.0);
//    }
//
//
//    3.15
//    public static void main(String[] args) {
//        int lottery = (int) (Math.random() * 1000);
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your lottery pick(two digits):");
//        int guess = input.nextInt();
//
//        int lotteryDigit1 = lottery / 100;
//        int lotteryDigit2 = lottery % 100/10;
//        int lotteryDigit3 = lottery % 10;
//
//        int guessDigit1 = guess / 10;
//        int guessDigit2 = guess % 100 /10;
//        int guessDigit3 = guess %10;
//
//        System.out.println("The lottery number is" + lottery);
//
//        if (guess == lottery)
//            System.out.println("Exact match:you win $10,000");
//        else if ((guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2&&guessDigit3==lotteryDigit3)||(guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2&&guessDigit1==lotteryDigit3)
//                ||(guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2&&guessDigit3==lotteryDigit3)||(guessDigit1 == lotteryDigit1 && guessDigit3 == lotteryDigit2&&guessDigit2==lotteryDigit3)
//                ||(guessDigit3 == lotteryDigit1 && guessDigit1 == lotteryDigit2&&guessDigit2==lotteryDigit3)||(guessDigit3 == lotteryDigit1 && guessDigit2 == lotteryDigit2&&guessDigit1==lotteryDigit3))
//            System.out.println("Match all digits:you win $3,000");
//        else if (guessDigit1 == lotteryDigit1 || guessDigit2 == lotteryDigit1 || guessDigit3 == lotteryDigit1
//                || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit2 || guessDigit3 == lotteryDigit2
//                || guessDigit1==lotteryDigit3||guessDigit2==lotteryDigit3||guessDigit3==lotteryDigit3)
//            System.out.println("Match one digit:you win $1,000");
//        else System.out.println("Sorry,no math");
//    }
//    3.17
//    public static void main(String[] args) {
//        System.out.println("scissor(0),rock(1),paper(2):");
//        int randomNumber=(int)(Math.random()*3);
//        Scanner input=new Scanner(System.in);
//        int guess=input.nextInt();
//        if(randomNumber==0){
//            if(guess==0)
//                System.out.println("电脑出的是剪刀，你出的是剪刀，平局");
//            else if(guess==1)
//                System.out.println("电脑出的是剪刀，你出的是石头，你赢了");
//            else if(guess==2)
//                System.out.println("电脑出的是剪刀，你出的是布，你输了");
//        }
//        else if(randomNumber==1){
//            if(guess==0)
//                System.out.println("电脑出的是石头，你出的是剪刀，你输了");
//            else if(guess==1)
//                System.out.println("电脑出的是石头，你出的是石头，平局");
//            else if(guess==2)
//                System.out.println("电脑出的是石头，你出的是布，你赢了");
//        }
//        else if(randomNumber==2){
//            if(guess==0)
//                System.out.println("电脑出的是布，你出的是剪刀，你赢了");
//            else if(guess==1)
//                System.out.println("电脑出的是布，你出的是石头，你输了");
//            else if(guess==2)
//                System.out.println("电脑出的是布，你出的是布，平局");
//        }
//    }
//    3.19
//    public static void main(String[] args) {
//        System.out.println("请输入三角形的三条边长");
//        Scanner input=new Scanner(System.in);
//        double l1=input.nextDouble();
//        double l2=input.nextDouble();
//        double l3=input.nextDouble();
//        double circumference=0;
//        if((l1+l2)>l3&&(l1+l3)>l2&&(l2+l3)>l1){
//                circumference=l1+l2+l3;
//            System.out.println("周长为"+circumference);
//        }
//        else System.out.println("边长的输入值不合法");
//    }
}
