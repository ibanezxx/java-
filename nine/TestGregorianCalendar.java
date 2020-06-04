package homework.nine;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestGregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar g=new GregorianCalendar();
        System.out.println(g.get(Calendar.YEAR)+" "+g.get(Calendar.MONTH)+" "+g.get(Calendar.DAY_OF_MONTH));
        g.setTimeInMillis(1234567898765L);
        System.out.println(g.get(Calendar.YEAR)+" "+g.get(Calendar.MONTH)+" "+g.get(Calendar.DAY_OF_MONTH));

    }
}
