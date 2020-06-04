package homework.twelve;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class PrintRank {
        public static void main(String[] args) throws Exception {

            String[][] boysNames=new String[10][1000];
            String[][] girlsNames=new String[10][1000];

            for (int i=0;i<10;i++) {
                String fileName;
                if (i==9){
                    fileName="babynamesranking2010.txt";
                }
                else {
                    fileName="babynamesranking200"+(i+1)+".txt";
                }
                try {
                    int j=0;
                    File f = new File(fileName);
                    Scanner input = new Scanner(f);
                    StringBuilder stringBuilder=new StringBuilder();
                    while (input.hasNext()) {
                        input.nextInt();//读取排名
                        boysNames[i][j] = input.next();//读取男孩名字
                        input.nextInt();//读取用该名字的人数
                        girlsNames[i][j] = input.next();//读取女孩名字
                        input.nextInt();//读取用该名字的人数
                        j++;
                        //读完一行
//                        String s=input.nextLine();
//                        String[] s1=s.split("  ");
//                        boysNames[i][j]=s1[1];
//                        girlsNames[i][j]=s1[3];
//                        j++;
                    }
                }catch (IOException ex) {
                    ex.printStackTrace();
                }
            }


            Scanner input=new Scanner(System.in);
            System.out.print("Enter the year:");
            int year=input.nextInt();
            System.out.print("Enter the gender:");
            char gender=input.next().charAt(0);
            System.out.print("Enter the name:");
            String name=input.next();
            int rank=0;
            int count=1;
            if (gender=='M'){
                for (int i=0;i<boysNames[year-2001].length;i++){
                    if ((boysNames[year-2001][i]).equals(name)){
                        rank=i+1;
                        System.out.println(name+" is ranked #"+rank+" in year "+year);
                        break;
                    }
                    else {count++;}

                    if (count==1001){
                        System.out.println(name+" is not ranked in year "+year);
                    }
                }
            }
            else {
                for (int i=0;i<girlsNames[year-2001].length;i++){
                    if (name.equals(girlsNames[year-2001][i])){
                        rank=i+1;
                        System.out.println(name+" is ranked #"+rank+" in year "+year);
                        break;
                    }
                    else {count++;}

                    if (count==1001){
                        System.out.println(name+" is not ranked in year "+year);
                    }
                }
            }

        }
    }

