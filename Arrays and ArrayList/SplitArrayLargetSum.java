package ArrayAndArrayList.Codes;

import java.util.Scanner;

public class SplitArrayLargetSum {
     public static void main(String[] args) {
          System.out.println("Enter the length of the array : ");
          int l;
          Scanner sc = new Scanner(System.in);
          l=sc.nextInt();
          int []arr = new int[l];
          System.out.println("Enter the elements of the array in  asencending order and then decending  : ");
          for (int i = 0; i < l; i++) {
               arr[i] = sc.nextInt();
          }
//          System.out.println(findPivot(arr));
          System.out.println("Enter the no. of partitions that can be made : ");
          int k = sc.nextInt( );
          int ans = splitArray(arr, k);
          System.out.println("Ans is : " + ans);
     }
     static int splitArray(int[] nums, int k) {
          int start = 0;
          int end = 0;
          for (int i = 0; i < nums.length; i++) {
               start = Math.max(start,nums[i]);
               end += nums[i];
          }

          // binary search
          while(start < end){
               // try for the middle as potential ans 
               int mid = start + (end - start)/2 ;
               
               //calculate how many pieces you can divide this in with this max sum 
               int sum = 0 ;
               int pieces = 1 ;
               for (int num : nums) {
                    if(sum + num > mid ){
                         // you cannot add this in this subarray, make a new array
                         sum = num ;
                         pieces ++ ;
                    }else {
                         sum += num ;
                    }
               }
               if(pieces > k){
                    start = mid +1 ;
               }
               else {
                    end = mid ;
               }
          }
          return end ;
     }
}
