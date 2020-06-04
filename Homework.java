package homework.oneToFive;

import java.sql.SQLOutput;

public class Homework {
//    1.1）编写程序，显示 Welcome to ]ava、Welcome to Computer Science 和 Programming is fun0
//    public static void main(String[] args) {
//        System.out.println("Welcome to Java");
//        System.out.print("Welcome to Computer Science\n");
//        System.out.printf("Programming is fun.");
//    }
//    1.3
//    public static void main(String[] args) {
//        System.out.println("    "+"J"+"    "+"A"+"      "+"V"+"    "+"V"+"   "+"A");
//        System.out.println("    "+"J"+"   "+"A A "+"     "+"V"+"  "+"V"+"   "+"A A");
//        System.out.println("J   "+"J"+"  "+"AAAAA "+"     "+"VV"+"   "+"AAAAA");
//        System.out.println("  J "+"J"+" "+"A     A "+"     "+"V"+"   "+"A     A");
//    }
//    //1.5
//    public static void main(String[] args) {
//        System.out.println((9.5*4.5-2.5*3)/(45.5-3.5));
//    }
//    //1.7
//    public static void main(String[] args) {
//        int n1=11;
//        int n2=13;
//        double sum11=0,sum13=0;
//        double oddOrEven=-1;
//        //判断奇偶项
//        double temp=0;
//        for(int i=0;i<n1;i++){
//            oddOrEven=oddOrEven*(-1);
//            temp=oddOrEven*1.0/(2*i+1);
//            sum11+=temp;
//        }
//        for(int i=0;i<n2;i++){
//            oddOrEven=oddOrEven*(-1);
//            temp=oddOrEven*1.0/(2*i+1);
//            sum13+=temp;
//        }
//        System.out.println(sum11+" "+sum13);
//    }
//    //1.9）编写程序，使用以下公式计算并显示宽度为 4.5、高度为 7.9的矩形的面积 和周长。
//    public static void main(String[] args) {
//        double width=4.5,height=7.9;
//        double area=0,circle=0;
//        area=width*height;
//        circle=2*(width+height);
//        System.out.printf("矩形面积为%f\n",area);
//        System.out.printf("矩形周长为%f",circle);
//    }
//    //1.11(人口估算）美国人口调査局基于以下假设进行人口估算：
//    // 每 7 秒有一个人诞生 每 13 秒有一个人死亡 每 45 秒有一个移民迁人
//    // 编写一个程序，显示未来 5 年的每年的人口数。
//    // 假设当前的人口是 312 032 486, 每年有 365 天。
//    // 提示：Java中，两个整数相除，结果还是整数，小数部分被去掉。
    public static void main(String[] args) {
        int sumsecond;
        int move;
        int birth;
        int death;
        int increase;
        for(int n=1;n<6;n++){
         sumsecond=n*365*24*60*60;
        //一年的总秒数
         move=sumsecond/45;
         birth=sumsecond/7;
         death=sumsecond/13;
         increase=312+move+birth-death;
            System.out.printf("第%d年人口为%d\n",n,increase);
        }
//        int increase=032+move+birth-death;
//        int increase=486+move+birth-death;

    }
    //1.13
//    public static void main(String[] args) {
//        double x=(44.5*0.55-50.2*5.9)/(3.4*0.55-50.2*2.1);
//        double y=(3.4*5.9-44.5*2.1)/(3.4*0.55-50.2*2.1);
//        System.out.println("x="+x+"\n"+"y="+y);
//    }
}
