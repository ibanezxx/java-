package homework.six;

import java.util.Scanner;

public class ConvertMillis {
    public static void main(String[] args) {
        System.out.println("输入毫秒数");
        Scanner input=new Scanner(System.in);
        long millis=input.nextLong();
        convertMillis(millis);
    }
    public static void convertMillis(long millis){
        long totalSeconds=millis/1000;
        int seconds=(int)totalSeconds%60;
        //得到刨去分钟以外的秒数
        long totalMinutes=totalSeconds/60;
        int minutes=(int)totalMinutes%60;
        //得到刨去小时数以外的分钟数
        int hours=(int)totalMinutes/60;
        System.out.println(hours+":"+minutes+":"+seconds);
    }
}
