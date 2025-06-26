import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Tags> tags = new ArrayList<>();
        tags.add(new Tags(1,"Sports"));
        tags.add(new Tags(2,"Casual"));
        tags.add(new Tags(3,"Formal"));
        tags.add(new Tags(4,"Treaking"));

//        List<Product> products = new ArrayList<>();
//        products.add(new Product(1, "Adidas",new ArrayList<Tags>()));
//        products.add(new Product(2, "Nike",new ArrayList<Tags>()));
//        products.add(new Product(3, "Puma",new ArrayList<Tags>()));
//        products.add(new Product(4, "Campus",new ArrayList<Tags>()));

        List<ProductPrice> productPrices = new ArrayList<>();
        productPrices.add(new ProductPrice(1, 2000));
        productPrices.add(new ProductPrice(2, 2500));
        productPrices.add(new ProductPrice(3, 3000));
        productPrices.add(new ProductPrice(4, 3350));

//        System.out.println(products);
//        System.out.println(tags);
//
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(4);
//        list.add(4);
//        TagService tagservice = new TagService(products,tags);
//        tagservice.addTag(3, list);
//
//       System.out.println(products);
        // CartService cart = new CartService(userList,products);

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Adidas"));
        products.add(new Product(2, "Nike"));
        products.add(new Product(3, "Puma"));
        products.add(new Product(4, "Campus"));

       List<User> userList = new ArrayList<>();
       userList.add(new User(1,"Harshal"));
       userList.add(new User(2, "Venktesh"));
       userList.add(new User(3,"Bhavesh"));

      CartService cart = new CartService(products,productPrices,userList);

      cart.addCart(2,3);
      cart.addCart(1,1);
     // cart.addCart(1,1);
        cart.addCart(1,1);
        cart.addCart(1,1);
       // cart.addCart(1,3);


        for(User user : userList)
        {
            System.out.println(user);
        }
    }
}