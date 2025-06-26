import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductPrice {

    int id;
    int price;

    public ProductPrice(int id, int price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//    public List<Integer> getList() {
//
//        return list;
//    }
//
//    public void setList(List<Integer> list) {
//        this.list = list;
//    }

    @Override
    public String toString() {
        return "ProductPrice{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}
