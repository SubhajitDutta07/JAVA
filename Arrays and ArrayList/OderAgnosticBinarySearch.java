package ArrayAndArrayList.Codes;

import java.util.Arrays;
import java.util.Scanner;

public class OderAgnosticBinarySearch {
    public static void main(String[] args) {
        int l, target;
        System.out.println("Enter the length of the array:");
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        int []arr = new int[l] ;
        System.out.println("Enter the elements in the array in ascending or descending order:");
        for (int i = 0; i < l; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element:");
        target = sc.nextInt();
        int start= 0;
        int end = l-1;
        if(arr[0]<arr[end])
            AscendingSearch(arr,target,start,end);
        else
            DescendingSearch( arr, target,start,end);
        System.out.println("Array :" + Arrays.toString(arr));
    }
    static void DescendingSearch(int []arr, int target, int start,int end){
        System.out.println("It is a descending oder array");
        if (target > arr[start] || target < arr[end]) {
            System.out.println("Element not present in the array");
            System.exit(0);
        }
        while (start < end) {
            int middle = start+(end-start)/2;
            if (target == arr[middle]) {
                System.out.println("Target element is found in the array at position " + (middle + 1));
                return;
            }
            if (target == arr[end]) {
                System.out.println("Target element is found in the array at position " + (end + 1));
                return;
            }
            if (target == arr[start]) {
                System.out.println("Target element is found in the array at position: " + (start + 1));
                return;
            }
            if (target > arr[middle])
                end = middle-1;
            else
                start = middle+1;
        }
       return;
    }
    static void AscendingSearch(int []arr, int target,int start,int end){
        System.out.println("It is an ascending order array");
        if (target < arr[start] || target > arr[end]) {
            System.out.println("Element not present in the array");
            System.exit(0);
        }
        while (start < end) {
            int middle = start+(end-start) / 2;
            if (target == arr[middle]) {
                System.out.println("Target element is found in the array at position " + (middle + 1));
                return;
            }
            if (target == arr[end]) {
                System.out.println("Target element is found in the array at position " + (end + 1));
                return;
            }
            if (target == arr[start]) {
                System.out.println("Target element is found in the array at position: " + (start + 1));
                return;
            }
            if (target < arr[middle])
                end = middle-1;
            else
                start = middle+1;
        }
        return;
    }
}
