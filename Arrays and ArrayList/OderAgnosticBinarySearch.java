package ArrayAndArrayList.Codes;

import java.util.Arrays;
import java.util.Scanner;

public class OderAgnosticBinarySearch {
    public static void main(String[] args) {
        int l, target;
        System.out.println("Enter the length of the array:");
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("Enter the elements in the array in ascending or descending order:");
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element:");
        target = sc.nextInt();
        int ans = orderAgnosticBS(arr,target);
        System.out.println("pos : " + (ans+1) );
    }

    static int orderAgnosticBS(int []arr, int target){
        int start = 0;
        int end = arr.length-1 ;

        // find whether the array is asc or desc order

        boolean isAsc = arr[end] > arr[start];

        while(start <= end){
            int mid = start + (end -start)/2;

            if (arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid])
                    end = mid-1;
                else if(target > arr[mid])
                    start = mid +1;
            }
            else {
                if(target > arr[mid])
                    end = mid -1;
                else if(target < arr[mid])
                    start = mid + 1;
            }

        }
        return -1;

    }
}
