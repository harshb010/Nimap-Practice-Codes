public class GenericMethodDemo {
    public static void main(String[] args) {
       Integer[] arr = {1,3,4,3,2,1,5};
       String[] str = {"Hello","World","Good","Morning"};
       printArray(arr);
       printArray(str);


    }

    public static <T> void printArray(T[] arr)
    {
        for(T t : arr)
        {
            System.out.print(t+" ");
        }

    }

}
