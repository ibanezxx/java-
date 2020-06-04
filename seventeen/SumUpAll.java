package homework.seventeen;

import java.io.*;

public class SumUpAll {
    public static void main(String[] args) throws IOException {
        DataOutputStream output=new DataOutputStream(new FileOutputStream("Exercise17_02.dat"));
        int numbers=(int)(Math.random()*10)+1;
        for (int count=0;count<numbers;count++){
        output.writeInt((int) (Math.random()*10));}
        output.close();

        DataInputStream input=new DataInputStream(new FileInputStream("Exercise17_02.dat"));
        int sum=0;
        int i=0;
        while (input.available()>0){
        sum+=input.readInt();
        System.out.println("第"+i+"次相加为："+sum);
        i++;
        }
        System.out.println("总和为："+sum);
    }
}
