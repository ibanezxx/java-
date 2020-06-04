package homework.twelve;

import javax.imageio.IIOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) throws Exception {
        try {
            URL url=new URL("http://liveexample.pearsoncmg.com/data/Salary.txt");
            Scanner input=new Scanner(url.openStream());
            double[] salarys=new double[4];
            int[] count=new int[4];
            while (input.hasNext()){
                String s=input.nextLine();
                String[] s1=s.split(" ");

                if (s1[2].equals("assistant")){
                    salarys[0]+=Double.parseDouble(s1[3]);
                    count[0]++;
                } else if (s1[2].equals("associate")){
                    salarys[1]+=Double.parseDouble(s1[3]);
                    count[1]++;
                }else if (s1[2].equals("full")){
                    salarys[2]+=Double.parseDouble(s1[3]);
                    count[2]++;
                }
                salarys[3]+=Double.parseDouble(s1[3]);
                count[3]++;
            }

            salarys[3]=salarys[0]+salarys[1]+salarys[2];
            System.out.println("assistant "+salarys[0]+" average "+salarys[0]/count[0]);
            System.out.println("associate "+salarys[1]+" average "+salarys[1]/count[1]);
            System.out.println("full      "+salarys[2]+" average "+salarys[2]/count[2]);
            System.out.println("all       "+salarys[3]+" average "+salarys[3]/count[3]);

        }catch (MalformedURLException ex){
            ex.printStackTrace();
        }catch (IIOException ex){
            ex.printStackTrace();
        }
    }
}
