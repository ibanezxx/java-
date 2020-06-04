package homework.twelve;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a words:");
        String words=input.nextLine();
        System.out.print("Enter a URL:");
        String url=input.nextLine();
        crawler(url);
    }
    public static void crawler(String startingURL) throws Exception {
        ArrayList<String> listOfPendingURLs=new ArrayList<>();
        ArrayList<String> listOfTraversedURLs=new ArrayList<>();

        listOfPendingURLs.add(startingURL);
        while (!listOfPendingURLs.isEmpty()&&listOfTraversedURLs.size()<=100){
            String urlString=listOfPendingURLs.remove(0);
            if (!listOfTraversedURLs.contains(urlString)){
                listOfTraversedURLs.add(urlString);
                System.out.println("Crawl "+urlString);

                for (String s: getSubWords(urlString)){
                    if (!listOfTraversedURLs.contains(s)) {
                        listOfPendingURLs.add(s);
                    }
                }
            }
        }

    }
    public static ArrayList<String> getSubWords(String urlString) throws Exception{
        ArrayList<String> list=new ArrayList<>();

        try {
            URL url=new URL(urlString);
            Scanner input=new Scanner(url.openStream());
            int current=0;
            while (input.hasNext()){
                String line=input.nextLine();
                current=line.indexOf("http:",current);
                while (current>0){
                    int endIndex=line.indexOf("\"",current);
                    if (endIndex>0){
                        list.add(line.substring(current,endIndex));
                        current=line.indexOf("http:",endIndex);
                    }
                    else {current=-1;}
                }
            }
        }catch (Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
        return list;
    }
}
