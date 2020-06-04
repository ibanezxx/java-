package homework.seven;

public class CountTheNumberOfSingleDigits {
    public static void main(String[] args) {
        int number=0;
        int[] counts=new int[10];
        for(int i=0;i<100;i++){
            number=(int)(Math.random()*10);
            switch (number){
                case 0:counts[0]++;
                        break;
                case 1:counts[1]++;
                    break;
                case 2:counts[2]++;
                    break;
                case 3:counts[3]++;
                    break;
                case 4:counts[4]++;
                    break;
                case 5:counts[5]++;
                    break;
                case 6:counts[6]++;
                    break;
                case 7:counts[7]++;
                    break;
                case 8:counts[8]++;
                    break;
                default:counts[9]++;
            }
        }
        for(int i=0;i<10;i++){
            System.out.println(i+"的个数是"+counts[i]+"个");
        }
    }
}
