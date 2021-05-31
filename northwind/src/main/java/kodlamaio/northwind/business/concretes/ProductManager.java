package kodlamaio.northwind.business.concretes;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
    public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
        Pageable pageable= PageRequest.of(pageNo,pageSize);
        return new SuccessDataResult<List<Product>>(this.productDao.findAll(pageable).getContent()) ;
    }

    @Override
    public DataResult<List<Product>> getAllSorted() {
        Sort sort= Sort.by(Sort.Direction.DESC,"productName");
        return new SuccessDataResult<List<Product>>(
                this.productDao.findAll(sort),"Successful"
        );
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("product added");
    }

    @Override
    public DataResult<Product> getByProductName(String productName) {
        //business code
       return new SuccessDataResult<Product>(
       this.productDao.getByProductName(productName),"data listed");
    }

    @Override
    public DataResult<Product> getByProductNameAndCategory(String productName, int categoryId) {
        return new SuccessDataResult<Product>(this.productDao.getByProductNameAndCategory_CategoryId(productName,categoryId),"data listed");
    }

    @Override
    public DataResult<Product> getByProductNameOrCategory(String productName, int categoryId) {
        return new SuccessDataResult<Product>((Product) this.productDao.getByProductNameOrCategory(productName,categoryId),"data listed");
    }


    @Override
    public SuccessDataResult<List<Product>> getByCategoryIn(List<Integer> categories) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByCategoryIn(categories),"data listed");
    }

    @Override
    public SuccessDataResult<List<Product>> getByProductNameContains(String productName) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameContains(productName),"data listed");
    }

    @Override
    public SuccessDataResult<List<Product>> getByProductNameStartsWith(String productName) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameStartsWith(productName),"data listed");
    }

    @Override
    public SuccessDataResult<List<Product>> getByProductNameEndsWith(String productName) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameEndsWith(productName),"data listed");
    }

    @Override
    public DataResult<Product> GetByNameAndCategory(String productName, int categoryId) {
        return new SuccessDataResult<Product>(this.productDao.getByProductNameAndCategory_CategoryId(productName,categoryId),"data listed");
    }

    @Override
    public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
        return new SuccessDataResult<List<ProductWithCategoryDto>>
                (this.productDao.getProductWithCategoryDetails(),"data listed");
    }

}
