package kodlamaio.northwind.dataAccess.abstracts;

import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//integer type of our primary key value of database
//with this JpaRepository interface we can make crud operations easily
public interface ProductDao extends JpaRepository<Product, Integer> {
    Product getByProductName(String productName);
    Product getByProductNameAndCategory_CategoryId(String productName,int categoryId);
    List<Product> getByProductNameOrCategory(String productName, int categoryId);
    List<Product> getByCategoryIn(List<Integer> categories);
    List<Product> getByProductNameContains(String productName);
    List<Product> getByProductNameStartsWith(String productName);
    List<Product> getByProductNameEndsWith(String productName);
    @Query("From Product Where productName=:productName and category.categoryId=:categoryId")
    List<Product>GetByNameAndCategory(String productName,int categoryId);
    @Query("Select new kodlamaio.northwind.entities.dtos.ProductWithCategoryDto" +
            "(p.id,p.productName,c.categoryName) From Category c Inner Join c.products p")
    List<ProductWithCategoryDto> getProductWithCategoryDetails();
    //select p.productId,p.productName from Category c inner join Product p
    //on c.category=p.categoryId






}
