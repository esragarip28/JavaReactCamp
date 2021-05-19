package kodlamaio.northwind.business.concretes;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//bean means that a project class

@Service
public class ProductManager implements ProductService {
    //dependency injection
    private ProductDao productDao;

    //instead of following part we can add @Autowired annotations up of the productDao variable
    //like this ;
    //@Autowired
    //private ProductDao productDao;
    //this is as dependency injection


    @Autowired
    public ProductManager(ProductDao productDao) {
        super();
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {

        return this.productDao.findAll();
    }

}
