package homework.six;

public class FootAndMeter {
    public static void main(String[] args) {
        //6.9
        double foot=1.0;
        double meter=20.0;
        System.out.printf("%s%20s%30s%20s\n","foot","meter","meter","foot");
        System.out.println("--------------------------------------------------------------------------");
        for(int i=1;i<=10;i++){
            System.out.printf("%4.1f%20.3f%30.1f%20.3f\n",foot,footToMeter(foot),meter,meterToFoot(meter));
            foot++;
            meter+=5 ;
        }
    }
    public static double footToMeter(double foot){
        double meter=foot*0.305;
        return meter;
    }
    public static double  meterToFoot(double meter){
        double foot=3.279*meter;
        return  foot;
    }
}