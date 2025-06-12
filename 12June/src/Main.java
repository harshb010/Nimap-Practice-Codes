//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,-3,-4,-5,6,7,-8};
        int temp = 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }
            }
        }

        for(int x : arr)
        {
            System.out.print(x+" ");
        }
    }
}