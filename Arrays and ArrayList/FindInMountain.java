package ArrayAndArrayList.Codes;

import java.util.Scanner;

public class FindInMountain {
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
          System.out.println("Enter the target element : ");
          int target = sc.nextInt( );
          int index = search(arr,target);
          if(index == -1){
               System.out.println("Target not found in the above array ");
               return;
          }
          System.out.println("Target found at index " + index );
     }

     static int search( int []arr, int target){
          int peak = peak(arr);
          int result = orderAgnosticSearch(arr,target,0,peak);
          if(result != -1){
               return result;
          }
          return orderAgnosticSearch(arr,target,peak,arr.length-1);
     }

     static int orderAgnosticSearch(int []arr, int target, int start, int end){
          boolean isAsc = arr[start] < arr[end] ;
          while(start <= end){

               int mid = start + (end - start)/2;

               if(arr[mid] == target)
                    return mid;
               if(isAsc){
                    if (target < arr[mid]){
                         end = mid -1;
                    }
                    else {
                         start = mid +1 ;
                    }
               }
               else {
                    if (target > arr[mid]){
                         end = mid -1;
                    }
                    else {
                         start = mid +1 ;
                    }
               }
          }
          return -1;
     }

     static int peak(int []arr){
          int start = 0;
          int end = arr.length;
          while(start < end){
               int mid = start + (end - start)/2;
               if(arr[mid]>arr[mid +1]){
                    end = mid ;
               }
               else {
                    start = mid +1 ;
               }
          }
          return start ;
     }
}
