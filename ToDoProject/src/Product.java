import java.util.ArrayList;
import java.util.List;

public class Product {
    private int id;
    private String productName;
    private List<Tags> listTags;


    public Product(int id, String productName, List<Tags> listTags) {
        this.id = id;
        this.productName = productName;
        this.listTags = listTags;
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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", listTags=" + listTags +
                '}';
    }


}
