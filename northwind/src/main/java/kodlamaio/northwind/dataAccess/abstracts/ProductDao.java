package kodlamaio.northwind.dataAccess.abstracts;

import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//integer type of our primary key value of database
//with this JpaRepository interface we can make crud operations easily
public interface ProductDao extends JpaRepository<Product, Integer> {

}
