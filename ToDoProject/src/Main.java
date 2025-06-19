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

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Adidas",new ArrayList<Tags>()));
        products.add(new Product(2, "Nike",new ArrayList<Tags>()));
        products.add(new Product(3, "Puma",new ArrayList<Tags>()));
        products.add(new Product(4, "Campus",new ArrayList<Tags>()));



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


       List<User> userList = new ArrayList<>();
       userList.add(new User(1,"Harshal"));
       userList.add(new User(2, "Venktesh"));
       userList.add(new User(3,"Bhavesh"));


       CartService cart = new CartService(userList,products);

        List<Integer> productlist = new ArrayList<>();
        productlist.add(1);

       cart.addCart(2,productlist);

        System.out.println(userList);
    }
}