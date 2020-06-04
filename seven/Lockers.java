package homework.seven;


public class Lockers {
    //7.23
    public static void main(String[] args) {
        boolean[] L=new boolean[100];
        for(int i=0;i<L.length;i++){
            L[i]=false;
        }
        //S1
        for(int i=0;i<L.length;i++){
            L[i]=true;
        }
        //S2
        for(int i=1;i<L.length;i+=2){
            L[i]=false;
        }
        //S3--S100
        for(int i=2;i<100;i++){
            for(int j=i;j<L.length;j+=(i+1)){
                if(L[i]==false)
                    L[i]=true;
                else L[i]=false;
            }
        }


        for(int i=0;i<L.length;i++){
            int count=1;
            if(L[i]==true) {
                System.out.print(i + 1 + " ");
                count++;
            }
            if(count%5==0){
                System.out.println();
            }
        }


    }
}
