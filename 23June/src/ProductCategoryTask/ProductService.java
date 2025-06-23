package ProductCategoryTask;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    int id=1;
    List<Product> productList = new ArrayList<>();
    CategoryService cs = new CategoryService();

    public void addProduct(String name, int categoryId)
    {
        Product product = new Product(id++, name, categoryId);
        productList.add(product);
        System.out.println(cs.getCategory());
        List<Category> category1 = cs.getCategory();
        System.out.println(category1);
        for(Category category : category1)
        {
            if(category.getId() == categoryId)
            {
                List<Product> productList1 = new ArrayList<>();
                productList1.add(product);
                category.setProducts(productList1);
            }
        }


    }

    public List<Product> getProductList()
    {
        return productList;
    }

}
