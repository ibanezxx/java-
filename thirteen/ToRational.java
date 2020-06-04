package homework.thirteen;

import java.math.BigInteger;
import java.util.Scanner;

public class ToRational {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a decimal number:");
        String number=input.next();
        System.out.println("The fraction number is "+toRational(number));
    }

    public static Rational toRational(String number){
        String[] n=number.split("[.]");
        if (n.length==1){
            //如果是整数
            return new Rational(new BigInteger(n[0]),BigInteger.ONE);
        }
        else {
            //如果是小数，先放大为整数，再变成分数，分母为放大倍数
            return new Rational(new BigInteger(n[0]+n[1]),getIncrease(n[1]));
        }
    }

    public static BigInteger getIncrease(String n){
        //将小数扩大increase倍
        BigInteger increase=BigInteger.ONE;
        for (int i=0;i<n.length();i++){
            increase=increase.multiply(new BigInteger("10"));
        }
        return increase;
    }

}
