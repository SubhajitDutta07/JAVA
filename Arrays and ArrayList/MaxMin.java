package ArrayAndArrayList.Codes;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int []arr = {1,5,2,5,213,5,2,56,45,23,636,7,45,7,-5};
        int []arr2={0,0} ;
        maxmin(arr,arr2);
        System.out.println("Max no. is: "+arr2[0]+" and Min no. is: "+ arr2[1]);

    }

     static void maxmin(int[] arr,int []arr2) {
        int max = arr[0];
        int min=arr[0];
         for (int i = 1; i < arr.length; i++) {
             if(max<arr[i])
                 max=arr[i];
             if(min>arr[i])
                 min=arr[i];
         }
         arr2[0]= max;
         arr2[1]=min;
         return;
    }


}
