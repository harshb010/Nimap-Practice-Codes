public class Logical1 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 6, 7, 5, 8};
        for(int i=0;i<arr.length;i++)
        {
            int count = 1;
            for(int j=0;j< arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count > 2)
            {
                System.out.println(arr[i]);
            }

        }
    }
}
