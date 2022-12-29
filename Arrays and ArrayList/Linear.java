package ArrayAndArrayList.Codes;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        int []arr = {1,5,2,5,213,5,2,56,45,23,636,7,45,7,-5};
        System.out.println("Enter the element to be searched:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(linerarSearch(arr , n));
//        System.out.println(linearSearch2(arr ,n) );
        System.out.println("Element found at index:"+linerarSearch3(arr ,n) );
//        int arr2[][] = new int[3][];
//    Arrays are mutable

    }
    // to return whether the no. is present or not
    static boolean linerarSearch(int []arr,int n){
        if(arr.length ==0){
            return false;
        }
        for (int i = 0; i <arr.length; i++) {
            if(n==arr[i])
                return true;
        }
        return false;
    }
    // to return the element itself
    static int linearSearch2(int []arr,int n){
        if (arr.length ==0)
            return Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int element= arr[i];
            if(n==element)
                return element;
        }
        return Integer.MAX_VALUE;
    }
    //to return the index
    static int linerarSearch3(int []arr,int n){
        if(arr.length ==0){
            return -1;
        }
        for (int i = 0; i <arr.length; i++) {
            if(n==arr[i])
                return i;
        }
        return -1;
    }
}
