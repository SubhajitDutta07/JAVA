package ArrayAndArrayList.Codes;

import java.util.Scanner;

public class CountRotations {
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
          System.out.println("rotation counts " + rotaionCount(arr));
     }

     static int rotaionCount(int []arr){
          return (pivot(arr)+1);
     }
     static int pivot(int []arr){
          int start = 0;
          int end = arr.length -1;
          while(start <= end){
               int mid = start + (end - start)/2;
               if(mid < end && arr[mid+1] < arr[mid]){
                    return mid ;
               }
               if(mid > start && arr[mid-1]>arr[mid]){
                    return mid-1;
               }
               if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                    if(arr[start]> arr[start + 1]){
                         return start;
                    }
                    start++ ;
                    if(arr[end-1]> arr[end]){
                         return end -1;
                    }
                    end-- ;
               }
               else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[end] < arr[mid]){
                    start = mid +1;
               }
               else {
                    end = mid -1 ;
               }
          }
          return -1;
     }
}