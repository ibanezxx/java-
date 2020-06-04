package homework.six;

import java.util.Scanner;

public class TelephoneNumber {
    //6.21
    public static void main(String[] args) {
        System.out.println("请输入电话");
        Scanner input=new Scanner(System.in);
        String telephone=input.nextLine();
        for(int i=0;i<telephone.length();i++) {
            if (telephone.charAt(i)<='Z'&&telephone.charAt(i)>='A'||telephone.charAt(i)>='a'&&telephone.charAt(i)<='z')
                System.out.print(getNumber(Character.toUpperCase(telephone.charAt(i))));
            else
                System.out.print(telephone.charAt(i));
        }
    }
    public static int getNumber(char uppercaseLetter){
        Character Upper=Character.toUpperCase(uppercaseLetter);
        int num=0;
        switch (Upper){
            case 'A':
                case 'B':
                case 'C':
                    num=2;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    num=3;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    num=4;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    num=5;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    num=6;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    num=7;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    num=8;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    num=9;
                    break;
        }
        return num;
    }
}
