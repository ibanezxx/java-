//package homework.twelve;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CreateAFile {
    public static void main(String[] args) throws IOException {
        File f=new File(args[0]);
        if (!f.exists()){
            f.createNewFile();
        }
        PrintWriter output=new PrintWriter(f);
        int i=1;
        while (i<=100){
            output.println((int)(Math.random()*100)+" ");
            i++;
        }
        output.close();

        Scanner input=new Scanner(f);
        int[] nums=new int[100];
        int j=0;
        while (input.hasNext()){
            nums[j]=input.nextInt();
            j++;
        }

        Arrays.sort(nums);

        for (j=0;j<100;j++){
            System.out.print(nums[j]+" ");
            if ((j+1)%10==0){
                System.out.println();
            }
        }
        input.close();
    }
}
