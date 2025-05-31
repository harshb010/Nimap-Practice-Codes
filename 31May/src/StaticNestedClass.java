
    public class StaticNestedClass {

        static class InnerClass {
            void show() {
                System.out.println("Static Nested Class");
            }
        }

        public static void main(String[] args) {
            StaticNestedClass.InnerClass show = new StaticNestedClass.InnerClass();
            show.show();
        }
    }


