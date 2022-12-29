package ArrayAndArrayList.Codes;

import java.util.Scanner;

public class FloorOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr= {2,3,5,6,8,10,13,15,18,20,25,29};
        System.out.println("Enter the target element:");
        int target = sc.nextInt();
        if(target < arr[0]) {
            System.out.println("Element is not present, smaller than the first element of the array");
            System.exit(0);
        }
        int ans=FloorNumber(arr,target);
        if(ans ==target)
            System.out.println("Element is found in the array");
        else
            System.out.println("The floor of the target element is "+ ans);
    }
    static int FloorNumber(int []arr, int target){
        int start=0;
        int end = arr.length-1;
        while(start <= end){
            int middle = start+(end - start)/2;
            if(target == arr[middle])
                return arr[middle];
            if(target == arr[start])
                return arr[start];
            if (target == arr[end])
                return arr[end];
            if(target<arr[middle])
                end = middle-1;
            else
                start = middle+1;
        }
        return arr[end];
    }
}
