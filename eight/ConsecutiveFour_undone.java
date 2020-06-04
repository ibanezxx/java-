package homework.eight;

import java.util.Scanner;

public class ConsecutiveFour_undone {
    //8.19
    public static void main(String[] args) {
        System.out.println("请输入行数和列数");
        Scanner input=new Scanner(System.in);
        int row=input.nextInt();
        int column=input.nextInt();
        int[][] numbers=new int[row][column];

        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                numbers[i][j]=input.nextInt();
            }
        }

        if (isConsectiveFour(numbers))
            System.out.println("有4个连续相等的数");
        else System.out.println("没有4个连续相等的数");
    }

    public static boolean isConsectiveFour(int[][] values){
        //判断行
        int countRow;
        for(int i=0;i<values.length;i++)
        {
            countRow=1;
            for(int j=1;j<values[i].length;j++)
            {
                if(values[i][j]==values[i][j-1])
                    countRow++;
                else countRow=1;

                if(countRow==4)
                    return true;
            }
        }
        //判断列
        int countColumn;
        for (int k = 3; k < values[0].length; k++) {
            countColumn = 1;
            for (int i = 1; i <= k && i < values.length; i++) {
                int j = k - i;
                if (values[i][j] == values[i - 1][j + 1])
                    countColumn++;
                else
                    countColumn = 1;
                if (countColumn == 4)
                    return true;
            }
        }


        return false;
        }

}
