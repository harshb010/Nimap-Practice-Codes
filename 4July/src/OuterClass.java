public class OuterClass {
    static class InnerStaticClass {
        private String message;

        public InnerStaticClass(String message) {
            this.message = message;
        }

        public void displayMessage() {
            System.out.println("Message: " + message);
        }
    }

    public static void main(String[] args) {
        InnerStaticClass inner = new InnerStaticClass("Hello from Inner Static Class!");
        inner.displayMessage();
    }
}
