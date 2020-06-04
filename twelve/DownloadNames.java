package homework.twelve;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class DownloadNames {
    public static void main(String[] args) throws Exception {
        //下载这10个文件

        for (int i = 0, j = 0; i < 10; i++) {
            String address;
            String fileName;
            if (i == 9) {
                address = "http://liveexample.pearsoncmg.com/data/babynamesranking2010.txt";
                fileName = "babynamesranking2010.txt";
            } else {
                address = "http://liveexample.pearsoncmg.com/data/babynamesranking200" + (i + 1) + ".txt";
                fileName = "babynamesranking200" + (i + 1) + ".txt";
            }
            try {

                URL url = new URL(address);
                Scanner input = new Scanner(url.openStream());
                StringBuilder s = new StringBuilder();

                boolean firstLine = true;
                while (input.hasNext()) {
                    String s1 = input.nextLine();
                    if (firstLine) {
                        s.append(s1);
                        firstLine = false;
                    } else {
                        s.append("\r\n" + s1);
                    }
                }
                input.close();

                File f = new File(fileName);
                if (!f.exists()) {
                    f.createNewFile();
                }
                PrintWriter output = new PrintWriter(f);
                output.println(s);
                output.close();

            } catch (MalformedURLException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }


    }
}
