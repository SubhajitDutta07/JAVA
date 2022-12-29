package ArrayAndArrayList.Codes;

public class SearchinInfiniteArray {
    public static void main(String[] args) {
        int []arr= {1,2,3,4,6,7,9,12,43,45,76,78,89,96,98,104,106,110,114,119,120,127,129,135,136,139,157,189};
        int target = 89;
        System.out.println("Element found at position : "+ans(arr,target));
    }
    static int ans( int[] arr,int target)
    {
        int start= 0;
        int end = 1;
        while(target > arr[end])
        {
            int newStart = end+1;
            end = end + (end - start +1)*2;
            start = newStart;
        }
        return search(arr,target,start,end);
    }
    static int search(int []arr, int target,int start , int end)
    {
        if (target < arr[start] || target > arr[end]) {
            System.out.println("Element not present in the chunck of the array");
            return -1;
        }
        while(start <= end) {
            int middle= start + (end-start)/2;
            if (target < arr[middle])
                end = middle-1;
            else if(target > arr[middle])
                start = middle+1;
            else
                return middle+1;
        }
        return -1;
    }
}
