package ArrayAndArrayList.Codes ;

import java.util.Scanner;
import java.util.Arrays ;

//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedSorted {
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
          System.out.println("Enter the target element : ");
          int target = sc.nextInt( );
          System.out.println("Element is at index : " + search(arr,target));
          System.out.println("Arrays is "+ Arrays.toString(arr));
     }

     static int search(int []arr, int target){
          int pivot = findPivot(arr);

          // if pivot not found, then the array is not rotated then just do binary search

          if (pivot == -1){
              return binarySearch(arr,target,0,arr.length-1);
          }

          // pivot is found then we have 2 ascending sorted arrays

          if(arr[pivot] == target){
               return pivot;
          }

          if(target < arr[0]){
               return binarySearch(arr,target,pivot+1 , arr.length-1);
          }else{
               return binarySearch(arr,target,0,pivot);
          }
     }

     static int findPivot(int []arr) {  // won't work on duplicate values
          int start =0 ;
          int end = arr.length-1;
          while (start <= end ){
               int mid = start + (end - start)/2;
               if(mid < end && arr[mid] > arr[mid +1]){
                    return mid;
               }
               if(mid > start && arr[mid -1] > arr[mid]){
                    return mid-1;
               }
               if(arr[mid] <= arr[start]){
                    end = mid -1 ;
               }else {
                    start = mid +1 ;
               }
          }
          return -1;
     }

     static int binarySearch(int []arr, int target, int start ,int end){
          while(start <= end){
               int mid = start + (end - start)/2;
               if(target > arr[mid]){
                    start = mid +1 ;
               }
               else if(target < arr[mid]){
                    end = mid -1 ;
               }
               else
                    return mid;
          }
          return -1;
     }
}