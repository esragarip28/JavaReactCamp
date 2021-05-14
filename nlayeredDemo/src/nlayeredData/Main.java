package nlayeredData;

import nlayeredData.business.abstracts.ProductService;
import nlayeredData.business.concretes.ProductManager;
import nlayeredData.core.JLoggerManagerAdapter;
import nlayeredData.dataAccess.concretes.AbcProductDao;
import nlayeredData.dataAccess.concretes.HibernateProductDao;
import nlayeredData.entities.concretes.Product;

public class Main {
    public static void main(String[] args) {
        // todo: it will recover with spring IoC

        ProductService productService=new ProductManager(new HibernateProductDao(),new JLoggerManagerAdapter());
        Product product=new Product(1,1,"Book",10,50);
         productService.add(product);
        Product product2=new Product(2,2,"Book",10,50);
        productService.add(product2);
        ProductService productService1=new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
        productService1.add(product);

    }
}
