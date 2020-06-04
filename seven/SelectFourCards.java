package homework.seven;

public class SelectFourCards {
    //7.29
    public static void main(String[] args) {
        int[] cards={1,2,3,4,5,6,7,8,9,10,11,12,13,
                     1,2,3,4,5,6,7,8,9,10,11,12,13,
                     1,2,3,4,5,6,7,8,9,10,11,12,13,
                     1,2,3,4,5,6,7,8,9,10,11,12,13};
        int[] select=new int[4];
        int times=0;

       for(int s1=0;s1<cards.length;s1++){
           for(int s2=0;s2<cards.length;s2++){
               for(int s3=0;s3<cards.length;s3++){
                   for(int s4=0;s4<cards.length;s4++){
                       select[0]=s1;
                       select[1]=s2;
                       select[2]=s3;
                       select[3]=s4;

                       if (select[0] + select[1] + select[2]+select[3]==24) {
                           times++;
                       }
                   }
               }
           }
       }
        System.out.println("选牌出现24共有"+times+"次");

    }
}
