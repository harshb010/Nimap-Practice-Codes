import java.util.ArrayList;
import java.util.List;

public class CartService {

    List<User> userList;
    List<Product> productList;
    List<ProductPrice> priceList;



    public CartService(List<Product> productList, List<ProductPrice> priceList, List<User> userList) {
        this.productList = productList;
        this.userList = userList;
        this.priceList = priceList;

    }

    public void addCart(int userId, int productId) {
        User selectedUser = null;
        Product selectedProduct = null;
        ProductPrice selectedPrice = null;
        for (User user : userList) {
            if (user.getId() == userId) {
                selectedUser = user;
                break;
            }
        }
        for (Product product : productList) {
            if (product.getId() == productId) {
                selectedProduct = product;
                break;
            }
        }
        for (ProductPrice price : priceList) {
            if (price.getId() == productId) {
                selectedPrice = price;
                break;
            }
        }
        if (selectedUser != null && selectedProduct != null && selectedPrice != null) {

            Cart cart = selectedUser.getCart();

            if (cart == null || cart.getProductList() == null || cart.getProductList().getId() != productId) {
                cart = new Cart();
                cart.setProductList(selectedProduct);
                cart.setQuantity(1);
                cart.setPrice(selectedPrice.getPrice());
            } else {
                int currentQuantity = cart.getQuantity();
                cart.setQuantity(currentQuantity + 1);
                cart.setPrice(selectedPrice.getPrice() * cart.getQuantity());
            }

            selectedUser.setCart(cart);
        }
    }





}



