package homework.eight;

import com.sun.security.jgss.GSSUtil;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class FrontAndBack {
    //8.11
    public static void main(String[] args) {
        int[][] num = new int[3][3];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 2);
            }
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511:");
        int number = input.nextInt();

        String decimalToBinary = Integer.toBinaryString(number);  //将十进制数转成字符串，例如n=5 ，s = "101"

        char[] stringArray = decimalToBinary.toCharArray();//转化为字符数组
        char[] hAndT = new char[9];

        for (int i = stringArray.length - 1, j = hAndT.length - 1; i >= 0; i--, j--) {
            hAndT[j] = stringArray[i];//从后往前赋值
            if (hAndT[j] == '1')
                hAndT[j] = 'T';
            else if (hAndT[j]=='0')
                hAndT[j]='H';
        }
        for (int i = 0; i < hAndT.length; i++) {
            if (hAndT[i] == '\u0000') {
                hAndT[i] = 'H';
                //没有被赋值的地方默认为0
            }
        }

        for (int i = 0; i < hAndT.length; i++) {
            System.out.print(hAndT[i] + " ");
            if ((i+1)%3==0)
                System.out.print("\n");
        }
    }
}
