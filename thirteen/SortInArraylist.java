package homework.thirteen;

import java.util.ArrayList;

public class SortInArraylist {
    public static void main(String[] args) {
        ArrayList<Number> list=new ArrayList<>();
        list.add(12);
        list.add(123);
        list.add(1);
        list.add(23);
        list.add(0);
        sort(list);
        System.out.println(list);

    }
    public static void sort(ArrayList<Number> list){
//        number;
        for (int i=0;i<list.size();i++){
            for (int j=1;j<list.size()-i;j++) {
                    if (list.get(j-1).intValue() > list.get(j).intValue()) {
                        Number    number=list.get(j-1);
                        list.set(j-1, list.get(j));
                        list.set(j, number.intValue());
                    }
            }

        }
    }
}
