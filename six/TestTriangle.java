package homework.six;

import java.util.Scanner;

public class TestTriangle {
    //6.19
    public static void main(String[] args) {
        System.out.println("请输入三角形三条边长");
        Scanner input=new Scanner((System.in));
        double side1=input.nextDouble();
        double side2=input.nextDouble();
        double side3=input.nextDouble();
        if(MyTriangle.isValid(side1,side2,side3)){
            System.out.printf("三角形的面积为%.1f",MyTriangle.area(side1,side2,side3));
        }
        else System.out.println("输入错误");
    }

}
class MyTriangle{
    public static boolean isValid( double side1, double side2,double side3){
        if(side1+side2<=side3||side1+side3<=side2||side2+side3<=side1) {
            System.out.println("无效");
            return false;
        }
        else
            return true;
    }
    public static double area( double side1, double side2, double side3){
        double s=(side1+side2+side3)/2;
        double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }
}
