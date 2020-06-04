package homework.twelve;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class CountScores {
    public static void main(String[] args) throws Exception {
        try {
            URL url = new URL("http://liveexample.pearsoncmg.com/data/Scores.txt");
            Scanner input = new Scanner(url.openStream());
            int sum=0;
            int count=0;
            while (input.hasNext()){
                int scores=Integer.parseInt(input.next());
                count++;
                sum+=scores;
            }
            System.out.println("总数为 "+count);
            System.out.println("平均分为 "+(double)sum/count);
        }catch (MalformedURLException ex){
            ex.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
