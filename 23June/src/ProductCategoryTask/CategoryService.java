package ProductCategoryTask;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {
     int id = 1;
    Category category;
    List<Category> categoryList = new ArrayList<>();
    List<Product> productList = new ArrayList<>();


    public void addCategory(String name)
    {
        Category category = new Category(id++, name, productList);
        categoryList.add(category);
    }

    public List<Category> getCategory()
    {
        return  categoryList;
    }


}
