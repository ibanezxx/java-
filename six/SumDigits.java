package homework.six;

public class SumDigits {
    public static void main(String[] args) {
        //6.13
        double m=0;
        System.out.printf("%s %20s\n","i","m(i)");
        for(int i=1;i<=20;i++){
            m+=sum(i);
            System.out.printf("%-18d%.4f\n",i,m);
        }
    }
    public static double sum(int i){
        double sum=(double)i/(i+1);
        return  sum;
    }
}
