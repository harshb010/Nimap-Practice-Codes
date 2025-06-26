import java.util.List;

public class Cart {
    private double price;
    private int quantity;
    private Product productList;

    public Cart() {

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProductList() {
        return productList;
    }

    public void setProductList(Product productList) {
        this.productList = productList;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Cart{" +
                " product=" + productList+
                ", quantity=" + quantity +
                  ", price=" + price +
                '}';
    }
}
