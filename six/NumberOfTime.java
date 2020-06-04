package homework.six;

import java.util.Scanner;

public class NumberOfTime {
    //6.23
    public static void main(String[] args) {
        System.out.println("请输入一串字符串");
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        System.out.println("请输入该字符串中的一个字符");
        char ch=input.next().charAt(0);
        System.out.println(ch+"在字符串中出现的次数是："+count(str,ch));
    }
    public static int count(String str, char a){
        int t=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)==a){
                t++;
            }
            }
        return t;
    }
}
