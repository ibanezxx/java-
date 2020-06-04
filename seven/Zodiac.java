package homework.seven;

import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {
        //7.33
        String[] zodiac={"monkey","rooster","dog","pig","rat","ox","tiger","rabbit","dragon","snake","horse","sheep"};
        System.out.println("Enter a year:");
        Scanner input=new Scanner(System.in);
        int year=input.nextInt();
        System.out.println(zodiac[year%12]);
    }
}
