import java.lang.reflect.Method;

class Apple{
    private void repair()
    {
        System.out.println("From repair");
    }

}
public class ReflectionDemo {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("Apple");
        Apple apple = (Apple) c.newInstance();
        Method method = c.getDeclaredMethod("repair");
        method.setAccessible(true);
        method.invoke(apple);

    }
}
