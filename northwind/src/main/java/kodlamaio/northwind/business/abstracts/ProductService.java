package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.entities.concretes.Product;

import java.util.List;
public interface ProductService {
   // List<Product> getAll();
    DataResult<List<Product>> getAll();
    DataResult<List<Product>> getAll(int pageNo,int pageSize);
    DataResult<List<Product>> getAllSorted();
    Result add(Product product);


    DataResult<Product> getByProductName(String productName);
    DataResult<Product> getByProductNameAndCategory(String productName,int categoryId);
    DataResult<Product> getByProductNameOrCategory(String productName, int categoryId);
    SuccessDataResult<List<Product>> getByCategoryIn(List<Integer> categories);
    SuccessDataResult<List<Product>> getByProductNameContains(String productName);
    SuccessDataResult<List<Product>> getByProductNameStartsWith(String productName);
    SuccessDataResult<List<Product>> getByProductNameEndsWith(String productName);
    DataResult<Product>GetByNameAndCategory(String productName,int categoryId);}








