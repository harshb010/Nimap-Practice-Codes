
public class GenericMethod {
    public static void main(String[] args) {
       Integer arr[] = {2,4,6,8,9,0};
       String array[] = {"Harsh","Harshal","Ganesh","Hello","World"};
       printArray(arr);
       printArray(array);
    }
    public static <T> void printArray(T[] arr)
    {
        for(T value : arr)
        {
            System.out.println(value+" ");
        }
    }

}
