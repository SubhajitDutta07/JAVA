package ArrayAndArrayList.Codes;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        int []arr = {1,5,2,5,213,5,2,56,45,23,636,7,45,7,-5};
        System.out.println("Enter the element to be searched:");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println("Enter the range of the search");
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(Searh(arr,target,start,end));
    }
    static boolean Searh(int [] arr, int target , int start, int end ){
        if(start<0)
            return false;
        if(end>arr.length)
            return false;
        if(arr.length == 0)
            return false;
        for (int i = start; i < end; i++) {
            if (arr[i]==target)
                return true;
        }
        return false;
    }
}
