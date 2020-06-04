package homework.ten;


import java.math.BigInteger;

public class NumberOfSquares {
    public static void main(String[] args) {
        BigInteger bigInteger=new BigInteger(String.valueOf(Long.MAX_VALUE));
        BigInteger num=new BigInteger(String.valueOf((long)Math.sqrt(Long.MAX_VALUE)));
        num=num.add(BigInteger.ONE);
        int i=0;
        while (i<10){
            if (num.multiply(num).compareTo(bigInteger)==1){
                System.out.println(num);
                i++;
            }
            num=num.add(BigInteger.ONE);
        }
    }
}
