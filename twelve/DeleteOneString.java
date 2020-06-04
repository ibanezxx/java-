package homework.twelve;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DeleteOneString {
        public static void main (String[]args) throws FileNotFoundException {
            File f = new File(args[1]);

            if (f.exists() == false) {
                System.out.println("file " + args[1] + " does not exist");
                System.exit(1);
            }

            Scanner input = new Scanner(f);
            StringBuilder s=new StringBuilder();


            boolean firstLine=true;
            while (input.hasNext()) {
               String  s1 = input.nextLine();
               String  s2 = s1.replaceAll(args[0], "");
               if (firstLine) {
                   s.append(s2);
                   firstLine=false;
               }
               else {
                   s.append("\r\n"+s2);
               }
            }
            input.close();

            PrintWriter output = new PrintWriter(f);
            output.println(s);
            output.close();
        }
    }
