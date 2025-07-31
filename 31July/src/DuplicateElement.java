public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 6, 7, 5, 8};
        for(int i=0;i< arr.length;i++)
        {
            boolean isDistinct = false;

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    isDistinct = true;
                    break;
                }
            }
            for(int k=0;k<i;k++)
            {
                if(arr[i] == arr[k])
                {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
