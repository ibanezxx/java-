package homework.twelve;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) throws Exception {

        try {
            URL url=new URL("http://liveexample.pearsoncmg.com/data/Lincoln.txt");
            int count=0;
            Scanner input=new Scanner(url.openStream());
            while (input.hasNext()){
                String s1=input.next();
                count ++;

            }
            System.out.println("The file size is "+count+" words");
        }catch (MalformedURLException ex){
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
