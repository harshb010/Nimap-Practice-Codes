package ReflectionDemo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PersonMain {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> personClass = Class.forName("ReflectionDemo.Person");

        Method[] methods = personClass.getDeclaredMethods();
        for(Method method : methods)
        {
            System.out.println(method.getName());
        }

        Object personObj = personClass.getDeclaredConstructor().newInstance();

        Field nameField = personClass.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(personObj, "Harshal");

        Method sayHelloMethod = personClass.getMethod("sayHello");
        sayHelloMethod.invoke(personObj);



    }
}
