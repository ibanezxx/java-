package homework.twelve;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChangeText {
    public static void main(String[] args) {
        String s=args[1];

        try {
            File f=new File(args[0]);
            File[] files=f.listFiles();
            for (int i=0;i<files.length;i++){
                Scanner input=new Scanner(files[i]);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
