package homework.seven;

import java.util.Scanner;

public class SolutionEquation {
    //7.25
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double[] eqn=new double[3];

        System.out.println("请输入a,b,c的值");
        for(int i=0;i<eqn.length;i++) {
            eqn[i] = input.nextDouble();
        }
        double delta=Math.pow(eqn[1],2)-4*eqn[0]*eqn[2];

        double[] roots=new double[2];
        if (solveQuadratic(eqn,roots)==0){
            System.out.println("没有实数根");
        }
        if (solveQuadratic(eqn,roots)==1){
            roots[0]=((-eqn[1])+Math.sqrt(delta))/(2*eqn[0]);
            roots[1]=roots[0];
            System.out.print("有两个相等实数根:");
            System.out.println("r1=r2="+roots[0]);
        }
        if (solveQuadratic(eqn,roots)==2){
            roots[0]=((-eqn[1])+Math.sqrt(delta))/(2*eqn[0]);
            roots[1]=((-eqn[1])-Math.sqrt(delta))/(2*eqn[0]);
            System.out.print("有两个不等实数根:");
            System.out.println("r1="+roots[0]+","+"r2="+roots[1]);
        }
    }
    public static int solveQuadratic(double[] eqn,double[] roots){
        double delta=Math.pow(eqn[1],2)-4*eqn[0]*eqn[2];
        if(delta==0){

        }
        else if (delta>0){

        }
        if(delta>0){
            return 2;
        }
        else if (delta==0){
            return 1;
        }
        else return 0;
    }
}
