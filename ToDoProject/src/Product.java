import java.util.ArrayList;
import java.util.List;

public class Product {
    private int id;
    private String productName;
    private List<Tags> listTags;
    private int amount;
    private int quantity;

    public Product(int id, String productName) {
        this.id = id;
        this.productName = productName;

    }

    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<Tags> getListTags() {
        return listTags;
    }

    public void setListTags(List<Tags> listTags) {
        this.listTags = listTags;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                '}';
    }
}
