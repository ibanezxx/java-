package homework.nine;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        long time=1000;
        Date date;
       for(int i=0;i<8;i++){
           time*=10;
           date=new Date(time);
           System.out.println(date.toString());
       }



    }
}
