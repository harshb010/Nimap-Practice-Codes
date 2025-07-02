public class ExceptionDemo1
{
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,4};
        try{
            System.out.println(arr[6]);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
