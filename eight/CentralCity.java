package homework.eight;

import java.util.Scanner;

public class CentralCity {
    public static void main(String[] args) {
        //8.21
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of cities");
        int numberOfCities=input.nextInt();
        System.out.println("Enter the coordinates of the cities:");
        double[][] coordinates=new double[5][2];

        for (int i=0;i<coordinates.length;i++){
            //输入坐标
            for (int j=0;j<coordinates[i].length;j++){
                coordinates[i][j]=input.nextDouble();
            }
        }

        double totalDistance=totalDistance(coordinates,0);
        double shortestDistance=totalDistance;
        int cityNumber=0;

        for(int i=0;i<coordinates.length;i++){
            //比较每一个城市的总距离
            if (totalDistance(coordinates,i)<totalDistance) {
                shortestDistance = totalDistance(coordinates, i);
                cityNumber = i;
            }
        }
        System.out.println("The " +
                "central city is at("+coordinates[cityNumber][0]+","+coordinates[cityNumber][1]+")");
        System.out.printf("The total distance to all other cities is %.2f",shortestDistance);

    }
    public static double totalDistance(double[][] cities,int cityNumber){
        double totalDistance=0;
        for(int i=0;i<cities.length;i++){
                double distance = Math.sqrt((cities[i][0] -cities[cityNumber][0]) * (cities[i][0] - cities[cityNumber][0])
                        + (cities[i][1] - cities[cityNumber][1]) * (cities[i][1] - cities[cityNumber][1]));
                totalDistance+=distance;
            }

        return totalDistance;
    }

}
