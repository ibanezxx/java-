package homework.twelve;
//
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_13 file");
            System.exit(1);
        }
        File f=new File(args[0]);
        if (f.exists()==false){
            System.out.println("file "+args[0]+" is not exist");
            System.exit(1);
        }
        Scanner input=new Scanner(f);
        int countLetters=0;
        int countWords=0;
        int countLine=0;
        while (input.hasNext()){
            String s1=input.nextLine();
            countLine++;
            String[] s2=s1.split(" ");
            countWords+=s2.length;
            for (int i=0;i<s2.length;i++){
                for (int j=0;j<s2[i].length();j++){
                    if (s2[i].charAt(j)>='a'&&s2[i].charAt(j)<='z'||s2[i].charAt(j)>='A'&&s2[i].charAt(j)<='Z'){
                        countLetters++;
                    }
                }
            }
        }

        System.out.println("File "+f+" has");
        System.out.println(countLetters+" letters");
        System.out.println(countWords+" words");
        System.out.println(countLine+" lines");
    }


}
