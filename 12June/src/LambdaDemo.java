
public class LambdaDemo {
    public static void main(String[] args) {
        LambdaInterface add = (a, b) ->  a + b;
        LambdaInterface sub = (a , b) -> a - b;

        System.out.println(add.calculate(2,6));
        System.out.println(sub.calculate(6,4));
    }
}
