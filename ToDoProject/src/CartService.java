
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CartService {
    private int userId;
    private Product product;


    List<User> userList;
    List<Product> productList;

    ProductPrice pp = new ProductPrice();
    List<Integer> priceList= pp.getList();

    public CartService(List<User> userList, List<Product> productList) {
        this.userList = userList;
        this.productList = productList;
    }

    public void addCart(int userId, List<Integer> products) {

        for (User u : userList) {
            if (u.getId() == userId) {
                List<Product> product = new ArrayList<>();

                for (Integer productId : products) {
                    for (Product p : productList) {
                        if (p.getId() == productId) {
                          p.setAmount(priceList.get(1));
                            product.add(p);
                            u.setProductList(product);
                        }
                    }

                }

            }
        }
    }
}
