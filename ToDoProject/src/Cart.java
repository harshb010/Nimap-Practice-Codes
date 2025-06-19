public class Cart {
    private double price;
    private Product product;
    private int userId;

    public Cart(double price, Product product, int userId) {
        this.price = price;
        this.product = product;
        this.userId = userId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "price=" + price +
                ", product=" + product +
                ", userId=" + userId +
                '}';
    }
}
