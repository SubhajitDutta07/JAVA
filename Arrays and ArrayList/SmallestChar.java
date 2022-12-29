package ArrayAndArrayList.Codes;

import java.util.Scanner;

public class SmallestChar {
    public static void main(String[] args) {
        char []arr= {'a','f','j','o','q'};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the target element :");
        char letter= sc.next().charAt(0);
        System.out.println(CellingNumber(arr, letter));
    }
    static char CellingNumber(char []arr, int target){
        int start=0;
        int end = arr.length-1;
        while(start <= end){
            int middle = start+(end - start)/2;
            if(target<arr[middle])
                end = middle-1;
            else
                start = middle+1;
        }
        return arr[start % arr.length];
    }
}
