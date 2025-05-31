public class ButtonTest {

    interface OnClickListener {
        void onClick();
    }

    public static void main(String[] args) {
        OnClickListener listener = new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("Anonymous Inner Class: Button clicked!");
            }
        };

        listener.onClick();
    }
}
