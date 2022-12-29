package ArrayAndArrayList.Codes;


public class MaxIn2DArray {
    public static void main(String[] args) {
        int [][]arr = {
                {52,9,1,8,0},
                {6,2,92,105,968,62},
                {89,2,68,53,5,78},
                {756,8,6,8,51}
        };

        System.out.println("Max element is : "+max(arr));
    }

    static int max(int[][] arr) {
        int max = arr[0][0];
        for (int[] ints : arr) {
            for (int element : ints) {
                if (max <= element)
                    max = element;
            }
        }
        return max;
    }
}
