package homework.seventeen;

import javax.xml.crypto.Data;
import java.io.*;
import java.util.Date;

public class StoreObject {
    public static void main(String[] args) throws IOException {
        int[] a=new int[]{1,2,3,4,5};
        File file=new File("Exercise17_05.dat");
        PrintWriter out=new PrintWriter(file);
        for (int i=0;i<a.length;i++){
        out.println(a[i]);}
        out.println(5.5);
        ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream(file));
        outputStream.writeObject(new Date().toString());
        out.close();
        outputStream.close();
    }
}
