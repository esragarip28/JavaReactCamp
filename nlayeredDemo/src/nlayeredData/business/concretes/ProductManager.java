package nlayeredData.business.concretes;

import nlayeredData.business.abstracts.ProductService;
import nlayeredData.core.LoggerService;
import nlayeredData.dataAccess.abstracts.ProductDao;
import nlayeredData.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {
    private ProductDao productDao;
    private LoggerService loggerService;
    public ProductManager(ProductDao productDao,LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService=loggerService;
    }



    @Override
    public void add(Product product) {
        //work code
        if (product.getCategoryId()==1){
            System.out.println("not accepted product from this category");
            return;
        }

        //HibernateProductDao dao=new HibernateProductDao();
        //dao.add(product);
        this.productDao.add(product);
        this.loggerService.logToSystem("");

    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
