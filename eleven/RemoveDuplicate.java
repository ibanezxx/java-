package homework.eleven;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter ten Integers: ");
        for (int i=0;i<10;i++){
            list.add(input.nextInt());
        }
        removeDuplicate(list);
        System.out.println("The distinct integers are "+list);
    }
    public static void removeDuplicate(ArrayList<Integer> list){
        for (int i=0;i<list.size();i++){
            for (int j=i+1;j<list.size();j++){
                if (list.get(i).compareTo(list.get(j))==0){
                    list.remove(j);
                    --j;
                }
            }
        }
    }
}
