package ArrayAndArrayList.Codes;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][]arr = {
                {52,9,1,8,0},
                {6,2,92,62},
                {89,2,68,53,5,78},
                {756,8,6,8,51}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched");
        int target = sc.nextInt();
        System.out.println(Arrays.toString(search(arr,target)));
    }

     static int[] search(int[][] arr, int target) {
         for (int row = 0; row < arr.length; row++) {
             for (int col = 0; col < arr[row].length; col++) {
                 if(arr[row][col] ==target)
                     return new int[]{row,col};
             }
         }
         return new int[]{-1,-1};
    }
}
