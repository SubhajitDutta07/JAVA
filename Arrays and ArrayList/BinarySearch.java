package ArrayAndArrayList.Codes;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int l, target;
        System.out.println("Enter the length of the array:");
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        int []arr = new int[l] ;
        System.out.println("Enter the elements in the array in ascending order:");
        for (int i = 0; i < l; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element:");
        target = sc.nextInt();
        int pos = BinaryS(arr,target);
        System.out.println("The target element is found at position "+ (pos+1) );
        System.out.println("Array :"+ Arrays.toString(arr));

    }
    static int BinaryS(int []arr, int target)
    {
        int start= 0;
        int end = arr.length-1;
        if (target < arr[start] || target > arr[end]) {
            System.out.println("Element not present in the array");
            return -1;
        }
        while(start <= end) {
            int middle= start + (end-start)/2;
            if (target < arr[middle])
                end = middle-1;
            else if(target > arr[middle])
                start = middle+1;
            else
                return middle;
        }
        return -1;
    }
}
