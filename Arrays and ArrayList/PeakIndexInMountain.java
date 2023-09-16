package ArrayAndArrayList.Codes;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/

import java.util.Arrays;
import java.util.Scanner;

public class PeakIndexInMountain{     // bitonic array
    public static void main (String[] args){
        System.out.println("Enter the length of the array : ");
        int l;
        Scanner sc = new Scanner(System.in);
        l=sc.nextInt();
        int []arr = new int[l];
        System.out.println("Enter the elements of the array in  asencending order and then decending  : ");
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        int index = peakIndex(arr);
        System.out.println("The peak index lies at : "+ index);
        System.out.println("Array :" + Arrays.toString(arr));
    }

    static int peakIndex(int []arr ){
        int start = 0;
        int end = arr.length-1;

        while ( start < end ){
            int middle = start + (end - start)/2 ;
            if(arr[middle] > arr[middle+1]) {
                // u r in the decresing part of the srray
                end = middle ;
            }
            else {
                // ypu are in the ascending part of the array
                start = middle +1 ; // because that mid+1 element > mid element
            }

            // in the end, start and end will be pointing towards the same element
        }
        return start; // start and end will be pointing towards the same element at the end
    }
}

