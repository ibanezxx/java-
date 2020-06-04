package homework.eleven;

import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter five numbers: ");
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<5;i++){
           list.add(input.nextInt());
        }
        sort(list);
        System.out.println(list.toString());
    }
    public static void sort(ArrayList<Integer> list){
        int temp=0;
        for (int i=0;i<list.size();i++){
            for (int j=0;j<list.size()-i-1;j++){
                if (list.get(j)>list.get(j+1)){
                    temp=list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }
    }
}
