package homework.oneToFive;

import java.util.Scanner;

public class Homeworktwo {
//    2.1
//    public static void main(String[] args) {
//        System.out.print("请输入摄氏温度：");
//        Scanner input=new Scanner(System.in);
//        double Celsius=input.nextDouble();
//        double Fahrenheit=(9.0/5)*Celsius+32;
//        System.out.printf("%.0f摄氏度可转化为%.2f华氏度",Celsius,Fahrenheit);
//    }
//    2.3
//    public static void main(String[] args) {
//        System.out.println("请输入英尺数");
//        Scanner input=new Scanner(System.in);
//        double feet=input.nextDouble();
//        double meter=feet*0.305;
//        System.out.printf("%.2f英尺等于%.4f米",feet,meter);
//    }
//    2.5
//    public static void main(String[] args) {
//        System.out.println("请输入费用");
//        Scanner input=new Scanner(System.in);
//        double subtotal=input.nextInt();
//        double rate=0.15;
//        subtotal=subtotal*(1+rate);
//        System.out.println(subtotal);
//    }
//    2.7
//    public static void main(String[] args) {
//        System.out.println("请输入分钟数");
//        Scanner input=new Scanner(System.in);
//        int minutes=input.nextInt();
//        int years=minutes/(365*24*60);
//        int days=minutes%(365*24*60)/(24*60);
//        System.out.println(years+"年"+days+"天");
//    }
//    2.9，
//  public static void main(String[] args) {
//        System.out.println("请输入起始速度和终止速度以及时间");
//        Scanner input=new Scanner(System.in);
//        double V0=input.nextDouble();
//        double V1=input.nextDouble();
//        double time=input.nextDouble();
//        double a=(V1-V0)/time;
//        System.out.printf("%.4f",a);
//    }
//    2.11
//    public static void main(String[] args) {
//            System.out.println("请输入年数");
//            Scanner input=new Scanner(System.in);
//            int n=input.nextInt();
//            int sumsecond=365*24*60*60;
//            int move=sumsecond/45;
//            int birth=sumsecond/7;
//            int death=sumsecond/13;
//            int increase=move + birth - death;
//            int sum=0;
//            for(int i=0;i<n;i++) {
//               sum+=increase;
//            }
//            System.out.printf("第%d年人口为%d\n",n,sum);
//
//    }
//    2.13
//    public static void main(String[] args) {
//        System.out.printf("请输入每个月存的钱:");
//        Scanner input=new Scanner(System.in);
//        int saving=input.nextInt();
//        double rate=0.00417;
//        double interest=0;
//        double account=0;
//        for(int i=0;i<6;i++){
//            account+=saving;
//            interest=account*rate;
//            account+=interest;
//        }
//        System.out.println(account);
//    }
//    2.15
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("请输入第一个点的坐标");
//        double x1=input.nextDouble();
//        double y1=input.nextDouble();
//        System.out.println("请输入第二个点的坐标");
//        double x2=input.nextDouble();
//        double y2=input.nextDouble();
//        double distance=0;
//        distance=Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
//        System.out.println("两点间距离为："+distance);
//    }
//    2.17
//    public static void main(String[] args) {
//        System.out.println("请输入在-58°F和49F°之间的温度以及大于等于2级的风速");
//        Scanner input=new Scanner(System.in);
//        double fahrenheit=input.nextDouble();
//        double windSpeed=input.nextDouble();
//        double windChill=0;
//        windChill=35.74+0.6215*fahrenheit-35.75*Math.pow(windSpeed,0.16)+0.4275*fahrenheit*Math.pow(windSpeed,0.16);
//        System.out.println(windChill);
//    }
//    2.19
//    public static void main(String[] args) {
//        System.out.println("请输入三角形的三个顶点坐标");
//        Scanner input=new Scanner(System.in);
//        double x1=input.nextDouble();
//        double y1=input.nextDouble();
//        double x2=input.nextDouble();
//        double y2=input.nextDouble();
//        double x3=input.nextDouble();
//        double y3=input.nextDouble();
//        double distance1=Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
//        //边长1
//        double distance2=Math.sqrt(Math.pow((x1-x3),2)+Math.pow((y1-y3),2));
//        //边长2
//        double distance3=Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2),2));
//        //边长3
//        double s=(distance1+distance2+distance3)/2;
//        double area=Math.sqrt(s*(s-distance1)*(s-distance2)*(s-distance3));
//        System.out.println(area);
//    }
//    2.21
//    public static void main(String[] args) {
//        System.out.println("请输入投资金额");
//        Scanner input=new Scanner(System.in);
//        double investment=input.nextDouble();
//        System.out.println("请输入年利率");
//        double monthRate=input.nextDouble()/100/12;
//        System.out.println("请输入投资年数");
//        int year=input.nextInt();
//        double sum=0;
//        sum=investment*Math.pow((1+monthRate),year*12);
//        System.out.println(sum);
//    }
//    2.23
//    public static void main(String[] args) {
//        System.out.println("请输入驾驶距离");
//        Scanner input=new Scanner(System.in);
//        double distance=input.nextDouble();
//        System.out.println("请输入每公里消耗的油量");
//        double consume=input.nextDouble();
//        System.out.println("请输入每加仑油量的价格");
//        double price=input.nextDouble();
//        double cost=distance/consume*price;
//        System.out.println(cost);
//    }

}