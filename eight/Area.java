package homework.eight;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        //8.33
        Scanner input=new Scanner(System.in);
        System.out.println("Enter x1,y1,x2,y2,x3,y3,x4,y4");
        double[][] points=new double[4][2];

        for(int i=0;i<points.length;i++){
            for(int j=0;j<points[i].length;j++){
                points[i][j]=input.nextDouble();
            }
        }

        double x1=points[0][0];
        double y1=points[0][1];

        double x2=points[1][0];
        double y2=points[1][1];

        double x3=points[2][0];
        double y3=points[2][1];

        double x4=points[3][0];
        double y4=points[3][1];

        double[] intersection=new double[2];
        double a=y1-y3;
        double b=-(x1-x3);
        double c=y2-y4;
        double d=-(x2-x4);
        double e=(y1-y3)*x1-(x1-x3)*y1;
        double f=(y2-y4)*x2-(x2-x4)*y2;
        //得到交点
        intersection[0]=(e*d-b*f)/(a*d-b*c);
        intersection[1]=(a*f-e*c)/(a*d-b*c);

        double[]  area=new double[4];

        //分别求四个三角形的面积
        //第一个三角形的面积
        double triangle1L1=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        double triangle1L2=Math.sqrt((x1-intersection[0])*(x1-intersection[0])+(y1-intersection[1])*(y1-intersection[1]));
        double triangle1L3=Math.sqrt((x2-intersection[0])*(x2-intersection[0])+(y2-intersection[1])*(y2-intersection[1]));
        double triangle1S=(triangle1L1+triangle1L2+triangle1L3)/2;
         area[0]=Math.sqrt(triangle1S*(triangle1S-triangle1L1)*(triangle1S-triangle1L2)*(triangle1S-triangle1L3));

        //第二个三角形的面积
        double triangle2L1=Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
        double triangle2L2=Math.sqrt((x3-intersection[0])*(x3-intersection[0])+(y3-intersection[1])*(y3-intersection[1]));
        double triangle2L3=Math.sqrt((x2-intersection[0])*(x2-intersection[0])+(y2-intersection[1])*(y2-intersection[1]));
        double triangle2S=(triangle2L1+triangle2L2+triangle2L3)/2;
        area[1]=Math.sqrt(triangle2S*(triangle2S-triangle2L1)*(triangle2S-triangle2L2)*(triangle2S-triangle2L3));

        //第三个三角形的面积
        double triangle3L1=Math.sqrt((x3-x4)*(x3-x4)+(y3-y4)*(y3-y4));
        double triangle3L2=Math.sqrt((x3-intersection[0])*(x3-intersection[0])+(y3-intersection[1])*(y3-intersection[1]));
        double triangle3L3=Math.sqrt((x4-intersection[0])*(x4-intersection[0])+(y4-intersection[1])*(y4-intersection[1]));
        double triangle3S=(triangle3L1+triangle3L2+triangle3L3)/2;
        area[2]=Math.sqrt(triangle3S*(triangle3S-triangle3L1)*(triangle3S-triangle3L2)*(triangle3S-triangle3L3));

        //第四个三角形的面积
        double triangle4L1=Math.sqrt((x1-x4)*(x1-x4)+(y1-y4)*(y1-y4));
        double triangle4L2=Math.sqrt((x1-intersection[0])*(x1-intersection[0])+(y1-intersection[1])*(y1-intersection[1]));
        double triangle4L3=Math.sqrt((x4-intersection[0])*(x4-intersection[0])+(y4-intersection[1])*(y4-intersection[1]));
        double triangle4S=(triangle4L1+triangle4L2+triangle4L3)/2;
        area[3]=Math.sqrt(triangle4S*(triangle4S-triangle4L1)*(triangle4S-triangle4L2)*(triangle4S-triangle4L3));

        double temp=0;
        for(int i=0;i<area.length-1;i++){
            for(int j=0;j<area.length-1-i;j++){
             if (area[j]>area[j+1]){
                 temp=area[j];
                 area[j]=area[j+1];
                 area[j+1]=temp;
             }
            }
        }
        System.out.print("The areas are ");
        for(int i=0;i<area.length;i++)
            System.out.printf("%.2f  ",area[i]);
    }

}
