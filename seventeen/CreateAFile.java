package homework.seventeen;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateAFile {
    public static void main(String[] args) throws IOException {
        PrintWriter output=new PrintWriter("Excercise17_01.txt");
        for (int i=0;i<100;i++) {
            output.print((int)(Math.random()*10)+"\n");
        }
        output.close();
    }
}
