package homework.oneToFive;

import java.util.Scanner;


public class Homeworkfour {
    //4.1五边形面积
//    public static void main(String[] args) {
//        System.out.println("请输入五边形中心到顶点的距离");
//        Scanner input=new Scanner(System.in);
//        double r=input.nextDouble();
//        double s=2*r*Math.sin(Math.PI/5);
//        double area=5*Math.pow(s,2)/(4*Math.tan(Math.PI/5));
//        System.out.println("五边形的面积为"+area);
//    }
    //4.3
    //Atlanta北纬33°46’西经84°25’
    //Savannah北纬32.04西经81.07
    //Orlando 北纬28.3, 西经 81.22
    //Charlotte西经 74.25 纬度:北纬41.02...
//    public static void main(String[] args) {
//        double Atlanta_X=Math.toRadians(84.25);
//        double Atlanta_Y=Math.toRadians(33.46);
//        double Savannah_X=Math.toRadians(81.07);
//        double Savannah_Y=Math.toRadians(32.04);
//        double Orlando_X=Math.toRadians(81.22);
//        double Orlando_Y=Math.toRadians(28.30);
//        double Charlotte_X=Math.toRadians(74.25);
//        double Charlotte_Y=Math.toRadians(41.02);
//        //将四边形面积化为两个三角形面积之和
//        //第一个三角形的两条边
//        double sideLength1=6371.01*Math.acos(Math.sin(Atlanta_X)*Math.sin(Savannah_X)+Math.cos(Atlanta_X)*Math.cos(Savannah_X)*Math.cos(Atlanta_Y-Savannah_Y));
//        double sideLength2=6371.01*Math.acos(Math.sin(Atlanta_X)*Math.sin(Charlotte_X)+Math.cos(Atlanta_X)*Math.cos(Charlotte_X)*Math.cos(Atlanta_Y-Charlotte_Y));
//
//        //两个三角形的公共边
//        double sideLength3=6371.01*Math.acos(Math.sin(Charlotte_X)*Math.sin(Savannah_X)+Math.cos(Charlotte_X)*Math.cos(Savannah_X)*Math.cos(Charlotte_Y-Savannah_Y));
//
//        //第二个三角形的两条边
//        double sideLength4=6371.01*Math.acos(Math.sin(Orlando_X)*Math.sin(Savannah_X)+Math.cos(Orlando_X)*Math.cos(Savannah_X)*Math.cos(Orlando_Y-Savannah_Y));
//        double sideLength5=6371.01*Math.acos(Math.sin(Orlando_X)*Math.sin(Charlotte_X)+Math.cos(Orlando_X)*Math.cos(Charlotte_X)*Math.cos(Orlando_Y-Charlotte_Y));
//
//
//        double s1=(sideLength1+sideLength2+sideLength3)/2;
//        double s2=(sideLength4+sideLength5+sideLength3)/2;
//
//        double area1=Math.sqrt(s1*(s1-sideLength1)*(s1-sideLength2)*(s1-sideLength3));
//        double area2=Math.sqrt(s2*(s2-sideLength4)*(s2-sideLength5)*(s2-sideLength3));
//        double area=area1+area2;
//
//        System.out.println("面积为"+area);
//    }
    //4.5
//    public static void main(String[] args) {
//        System.out.println("请输入边的条数");
//        Scanner input=new Scanner(System.in);
//        int numberOfSides=input.nextInt();
//        System.out.println("请输入边长");
//        double sideLength=input.nextDouble();
//        double area=numberOfSides*sideLength*sideLength/(4*Math.tan(Math.PI/numberOfSides));
//        System.out.println(area);
//    }
    //4.7
//    public static void main(String[] args) {
//        System.out.println("请输入正五边形外切圆的半径");
//        Scanner input=new Scanner(System.in);
//        double r=input.nextDouble();
//        double p2X=0;
//        double p2Y=r;
//
//        double p1X=r*Math.cos(18.0/180*Math.PI);
//        double p1Y=r*Math.sin(18.0/180*Math.PI);
//
//        double p3X=-r*Math.cos(18.0/180*Math.PI);
//        double p3Y=r*Math.sin(18.0/180*Math.PI);
//
//        double p4X=-r*Math.cos(54.0/180*Math.PI);
//        double p4Y=-r*Math.sin(54.0/180*Math.PI);
//
//        double p5X=r*Math.cos(54.0/180*Math.PI);
//        double p5Y=-r*Math.sin(54.0/180*Math.PI);
//
//        System.out.println(p1X+","+p1Y);
//        System.out.println(p2X+","+p2Y);
//        System.out.println(p3X+","+p3Y);
//        System.out.println(p4X+","+p4Y);
//        System.out.println(p5X+","+p5Y);
//
//    }
    //4.9
//    public static void main(String[] args) {
//        System.out.println("输入一个字符");
//        Scanner input=new Scanner(System.in);
//        char ch=input.next().charAt(0);
//        int charToNumber=(int)ch;
//        System.out.println(charToNumber);
//    }
    //4.11
//    public static void main(String[] args) {
//        System.out.println("请输入一个0到15之间的整数");
//        Scanner input=new Scanner(System.in);
//        int decimalNumber=input.nextInt();
//        char hexaDecimal=0;
//        if(decimalNumber>=10&&decimalNumber<=15){
//            switch (decimalNumber){
//                case 10:hexaDecimal='A';
//                        break;
//                case 11:hexaDecimal='B';
//                        break;
//                case 12:hexaDecimal='C';
//                        break;
//                case 13:hexaDecimal='D';
//                        break;
//                case 14:hexaDecimal='E';
//                        break;
//                case 15:hexaDecimal='F';
//                default:break;
//            }
//            System.out.println(decimalNumber+"转化为16进制："+hexaDecimal);
//        }
//        else if(decimalNumber>=0&&decimalNumber<=9){
//            System.out.println(decimalNumber+"转化为16进制："+decimalNumber);
//        }
//        else {
//            System.out.println(decimalNumber + "是一个错误输入");
//        }
//    }
    //4.13
//    public static void main(String[] args) {
//        System.out.println("请输入一个字母");
//        Scanner input= new Scanner(System.in);
//        char letter=input.next().charAt(0);
//        if((letter<'A'||letter>'Z')&&(letter<'a'||letter>'z')){
//            System.out.println(letter+"是一个错误输入");
//        }
//        else if(letter=='a'||letter=='A'||letter=='e'||letter=='E'
//                ||letter=='i'||letter=='I'||letter=='o'||letter=='O'
//                ||letter=='u'||letter=='U'){
//            System.out.println(letter+"是元音字母");
//        }
//        else{ System.out.println(letter+"是辅音字母");}
//    }
    //4.15
//    public static void main(String[] args) {
//        System.out.println("输入一个字母");
//        Scanner input=new Scanner(System.in);
//        char letter=Character.toLowerCase(input.next().charAt(0));
//        if(letter>'a'&&letter<'z'){
//            switch (letter){
//                case 'a':
//                case 'b':
//                case 'c':
//                    System.out.println("对应数字为2");
//                    break;
//                case 'd':
//                case 'e':
//                case 'f':
//                    System.out.println("对应数字为3");
//                    break;
//                case 'g':
//                case 'h':
//                case 'i':
//                    System.out.println("对应数字为4");
//                    break;
//                case 'j':
//                case 'k':
//                case 'l':
//                    System.out.println("对应数字为5");
//                    break;
//                case 'm':
//                case 'n':
//                case 'o':
//                    System.out.println("对应数字为6");
//                    break;
//                case 'p':
//                case 'q':
//                case 'r':
//                case 's':
//                    System.out.println("对应数字为7");
//                    break;
//                case 't':
//                case 'u':
//                case 'v':
//                    System.out.println("对应数字为8");
//                    break;
//                case 'w':
//                case 'x':
//                case 'y':
//                case 'z':
//                    System.out.println("对应的数字为9");
//                default:break;
//            }
//        }
//        else {
//            System.out.println(letter+"输入错误");
//        }
//    }
    //4.17
//    public static void main(String[] args) {
//        System.out.println("请输入年份");
//
//        Scanner input=new Scanner(System.in);
//        int year=input.nextInt();
//        System.out.println("请输入月份名称的前三个字母（第一个字母要大写）");
//        String month=new String();
//        month=input.nextLine();
//        int day=0;
//        if(year%4==0||year%400==0){
//            if(month=="Feb"){
//                day=29;
//            }
//        }
//        else day=28;
//
//        switch (month){
//            case "Jan":day=31;
//                break;
//            case "Mar":day=31;
//                break;
//            case "Apr":day=30;
//                break;
//            case "May":day=31;
//                break;
//            case "Jun":day=30;
//                break;
//            case "Jul":day=31;
//                break;
//            case "Aug":day=31;
//                break;
//            case "Set":day=30;
//                break;
//            case "Oct":day=31;
//                break;
//            case "Nov":day=30;
//                break;
//            case "Dec":day=31;
//            default:
//                break;
//        }
//        System.out.printf("%s %d有%d天",month,year,day);
//    }
    //4.19
//  public static void main(String[] args) {
//        System.out.println("请输入ISBN号");
//        Scanner input=new Scanner(System.in);
//        String number=input.nextLine();
//        int d10;
//      d10=(Integer.parseInt(String.valueOf(number.charAt(0)))*1+Integer.parseInt(String.valueOf(number.charAt(1)))*2
//              +Integer.parseInt(String.valueOf(number.charAt(2)))*3+Integer.parseInt(String.valueOf(number.charAt(3)))*4
//              +Integer.parseInt(String.valueOf(number.charAt(4)))*5+Integer.parseInt(String.valueOf(number.charAt(5)))*6
//              +Integer.parseInt(String.valueOf(number.charAt(6)))*7+Integer.parseInt(String.valueOf(number.charAt(7)))*8
//              +Integer.parseInt(String.valueOf(number.charAt(8)))*9)%11;
//
//
////        int d10=(d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
//        if(d10==10){
//            System.out.println(number+'X');
//        }
//        else System.out.println(number+d10);
//
//
//   }
    //4.21
    public static void main(String[] args) {
        System.out.println("请输入一个社保号码，格式是DDD-DD-DDDD");
        Scanner input=new Scanner(System.in);
        String ssnNumber=input.nextLine();
        if(ssnNumber.length()!=11)
            System.out.println("无效的社保号码");
        else {
            if(ssnNumber.charAt(3)!='-'||ssnNumber.charAt(6)!='-'){
                System.out.println("无效的社保号码");
            }
            else System.out.println(ssnNumber+"是一个有效的社保号码");
        }
    }
    //4.23
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.print("请输入雇员的名字：");
//        String employeesName=input.nextLine();
//        System.out.print("\n请输入每周的工作小时数");
//        double workTime=input.nextDouble();
//        System.out.print("\n请输入每小时的酬金");
//        double hourlyPay=input.nextDouble();
//        System.out.println("\n请输入联邦所得税税率");
//        double federalRate=input.nextDouble();
//        System.out.println("\n请输入州所得税税率");
//        double stateRate=input.nextDouble();
//        System.out.println("雇员名字："+employeesName);
//        System.out.println("每周工作小时数："+workTime);
//        System.out.println("每小时的酬金：$"+hourlyPay);
//        System.out.println("一周的酬金：$"+hourlyPay*workTime);
//        System.out.println("扣除:");
//        System.out.println("    联邦所得税：%"+hourlyPay*workTime*federalRate);
//        System.out.println("    州所得税：%"+hourlyPay*workTime*stateRate);
//        System.out.printf("    总扣除：$%f",hourlyPay*workTime*federalRate+hourlyPay*workTime*stateRate);
//        System.out.println("\n净薪酬：$"+(hourlyPay*workTime-hourlyPay*workTime*federalRate-hourlyPay*workTime*stateRate));
//    }
    //4.25
//    public static void main(String[] args) {
//        //随机数最大为0.99,（int）(0.99*26)=25
//        char ch1=(char)(Math.random()*26+65);
//        char ch2=(char)(Math.random()*26+65);
//        char ch3=(char)(Math.random()*26+65);
//
//        int num1=(int)(Math.random()*10);
//        int num2=(int)(Math.random()*10);
//        int num3=(int)(Math.random()*10);
//        int num4=(int)(Math.random()*10);
//
//        System.out.println("车牌为"+ch1+ch2+ch3+num1+num2+num3+num4);
//    }
}
