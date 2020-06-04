package homework.eleven;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {
    public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(0);
    list.add(2);
    System.out.println(list);
    shuffle(list);
    System.out.println(list);
    }
    public static void shuffle(ArrayList<Integer> list){
        Collections.shuffle(list);
    }
}
