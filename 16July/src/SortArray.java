import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {12,13,2,5,6,1};
        for(int i =0;i<arr.length-1;i++)
        {
            int temp = 0;
            if(arr[i]>arr[i+1])
            {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i=-1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
