package homework.thirteen;

import java.math.BigInteger;
import java.util.Scanner;

public class TestRational {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first rational number:");
        BigInteger n1=BigInteger.valueOf(input.nextInt());
        BigInteger d1=BigInteger.valueOf(input.nextInt());
        Rational r1=new Rational(n1,d1);
        System.out.print("Enter the second rational number:");
        BigInteger n2=BigInteger.valueOf(input.nextInt());
        BigInteger d2=BigInteger.valueOf(input.nextInt());
        Rational r2=new Rational(n2,d2);
        System.out.println(r1+" + "+r2+" = "+r1.add(r2));
        System.out.println(r1+" - "+r2+" = "+r1.subtract(r2));
        System.out.println(r1+" * "+r2+" = "+r1.multiply(r2));
        System.out.println(r1+" / "+r2+" = "+r1.divide(r2));
        System.out.println(r2+" is "+r2.doubleValue());
    }
}
