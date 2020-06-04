package homework.six;

import com.sun.tools.javac.Main;

public class Salary {
    public static void main(String[] args) {
        //6.11
        System.out.printf("%s%20s\n","销售总额","酬金");
        for(double i=10000;i<=100000;i+=5000){
            System.out.printf("%.0f%25.1f\n",i,computeCommission(i));
        }
    }
    public static double computeCommission(double salesAmount){
        double salary=0;
        if(salesAmount<=5000){
            salary=salesAmount*0.08;
        }
        else if(salesAmount>5000&&salesAmount<=10000){
            salary=5000*0.08+(salesAmount-5000)*0.1;
        }
        else if(salesAmount>10000){
            salary=5000*0.08+5000*0.1+(salesAmount-10000)*0.12;
        }
        return salary;
    }

}
