package kodlamaio.northwind.business.concretes;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
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
    public DataResult<List<Product>> getAll() {
        //there is no problem to make new entities
        return new SuccessDataResult<>(this.productDao.findAll(),"data listed");
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("product added");
    }

}
