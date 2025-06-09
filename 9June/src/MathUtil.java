class MathUtil {

    public static <T extends Number> double square(T number) {
        return number.doubleValue() * number.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(square(5));
        System.out.println(square(3.14));
    }
}
