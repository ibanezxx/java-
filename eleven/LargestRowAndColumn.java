package homework.eleven;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestRowAndColumn {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int n=input.nextInt();
        int[][] nums=new int[n][n];
        
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums[i].length;j++){
                nums[i][j]=(int)(Math.random()*2);
            }
        }
        
        System.out.println("\nThe random array is:");
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }

        ArrayList<Integer> row=new ArrayList<>(n);
        int sumOfRow=sumOfRow(nums[0]);
        for (int i=1;i<nums.length;i++){
                //比较每一行的总和大小
                    if (sumOfRow<sumOfRow(nums[i])){
                        sumOfRow=sumOfRow(nums[i]);
                        row.clear();
                        row.add(i);
                    }
                    else if (sumOfRow==sumOfRow(nums[i])){
                        row.add(i);
                    }
                }

        ArrayList<Integer> column=new ArrayList<>(n);
        int sumOfColumn=sumOfColumn(nums,0);
        for (int i=0;i<nums[0].length;i++){
//                比较每列的总和大小
                if (sumOfColumn<sumOfColumn(nums,i)){
                    sumOfColumn=sumOfColumn(nums,i);
                    column.clear();
                    column.add(i);
                }
                else if (sumOfColumn==sumOfColumn(nums,i)){
                    column.add(i);
                }
            }

        System.out.println("The largest row index:"+row);
        System.out.println("The largest column index:"+column);


        }


        public static int sumOfRow(int[] arr){
            int sum=0;
            for (int i=0;i<arr.length;i++){
                sum+=arr[i];
            }
            return sum;
        }

        public static int sumOfColumn(int[][] arr,int index){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i][index];
        }
        return sum;
        }
    }

