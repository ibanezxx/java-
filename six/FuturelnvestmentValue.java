package homework.six;

import java.util.Scanner;

public class FuturelnvestmentValue {
    public static void main(String[] args) {
        //6.7
        System.out.println("请输入投资金额");
        Scanner input =new Scanner(System.in);
        int investmentAmount=input.nextInt();
        System.out.println("请输入年利率");
        double yearlyInterestRate=input.nextDouble();
        double monthlyInterestRate=yearlyInterestRate/1200;
        System.out.println("Years  "+"        "+"FutureValve");
        for(int i=1;i<=30;i++){
            System.out.printf("%-4d%20.2f\n",i,futurelnvestmentValue(investmentAmount,monthlyInterestRate,i));
        }
    }
    public static double futurelnvestmentValue( double investmentAmount, double monthlyInterestRate, int years){
        double sum=0;
        sum=investmentAmount*Math.pow((1+monthlyInterestRate),years*12);
        return sum;
    }
}
