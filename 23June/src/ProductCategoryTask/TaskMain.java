package ProductCategoryTask;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TaskMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductService product = new ProductService();
        CategoryService category = new CategoryService();
        boolean x = true;
        while(x)
        {
            System.out.println("1 - add Product");
            System.out.println("2 - view Product");
            System.out.println("3 - add Category");
            System.out.println("4 - View Categories");
            int num = sc.nextInt();
            switch(num)
            {
                case 1 : {
                    System.out.println("Product Name and Id");
                    String productName = sc.next();
                    int categoryId = sc.nextInt();
                    product.addProduct(productName,categoryId);
                    break;
                }
                case 2 :
                {
                    System.out.println(product.getProductList());
                    break;
                }
                case 3 : {
                    System.out.println("Category Name");
                    String categoryName = sc.next();
                    category.addCategory(categoryName);
                    break;
                }
                case 4 :
                {
                    System.out.println(category.getCategory());
                    break;
                }
                default: x = false;
            }
        }


    }
}
