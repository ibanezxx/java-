package homework.ten;

import java.math.BigInteger;

public class Mersenne {
    public static void main(String[] args) {
        BigInteger bigInteger=new BigInteger("2");
        int[] nums=new int[101];
        //得到100以内的所有素数
        int i,j,k=0;
        for (i=2;i<=100;i++){
            for (j=2;j<i;j++){
                if (i%j==0) {
                  break;
                }
            }
            if(j>=i){
                nums[k]=i;
                k++;
            }
        }

        BigInteger b=new BigInteger("2");
        BigInteger temp=new BigInteger("2");
        for (int n=0;n<nums.length;n++) {
            bigInteger = b.pow(nums[n]).subtract(BigInteger.ONE);
            for (k = 2; k < n; k++) {
                if (bigInteger.remainder(temp).equals(BigInteger.ZERO)){
                    break;
                }
                temp=new BigInteger(String.valueOf(k++));
            }
            if (k>=n)
                System.out.println(nums[n]+" "+bigInteger);

        }

    }
}
