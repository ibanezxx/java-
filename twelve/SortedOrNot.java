package homework.twelve;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SortedOrNot {
    public static void main(String[] args) throws FileNotFoundException {
            File f=new File("D:\\Experience_Guidebook\\src\\homework\\twelve\\SortedStrings.txt");
            Scanner input=new Scanner(f);
            String s1=input.next();
            while (input.hasNext()){
                String s2=input.next();
                if (s1.compareTo(s2)>0){
                    System.out.println(s1+" and "+s2+" are unsorted ");
                    System.exit(1);
                    break;
                }
                s1=s2;
            }
            System.out.println(f+" is sorted");

    }
}
