package homework.six;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
//        6.3
        System.out.println("请输入一个整数");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (!isPalindrome(number)) {
            System.out.println("不是回文数");
        } else {
            System.out.println("是回文数");
        }
    }

    public static int reverse(int number) {
        String str = String.valueOf(number);
        char[] num1 = str.toCharArray();
        char[] num2=new char[num1.length];
        if (num1.length % 2 != 0) {
            for (int i = 0; i < (num1.length - 1); i++) {
                num2[ num1.length - 1 - i] = num1[i];
                num2[i] = num1[num1.length - 1 - i];
            }
        }
        else
            for (int i = 0; i < num1.length; i++) {
                num2[ num1.length - 1 - i] = num1[i];
                num2[i] = num1[num1.length - 1 - i];
            }
        int n=Integer.valueOf(String.valueOf(num2));
        return n;
    }
    public static boolean isPalindrome(int number) {
        int num = reverse(number);
        if (num == number)
            return true;
        else {
            return false;
        }
    }
}
