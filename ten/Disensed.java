package homework.ten;

import java.math.BigInteger;

public class Disensed {
    public static void main(String[] args) {
        String stringLong = String.valueOf(Long.MAX_VALUE);
        BigInteger bigInteger=new BigInteger(stringLong);
        BigInteger b1=new BigInteger("5");
        BigInteger b2=new BigInteger("6");
        bigInteger=bigInteger.add(BigInteger.ONE);
        int i=0;
        while (i<10){

            if (bigInteger.remainder(b1).equals(BigInteger.ZERO)||bigInteger.remainder(b2).equals(BigInteger.ZERO)){
                System.out.println(bigInteger);
                i++;
            }

            bigInteger=bigInteger.add(BigInteger.ONE);
        }
    }
}
