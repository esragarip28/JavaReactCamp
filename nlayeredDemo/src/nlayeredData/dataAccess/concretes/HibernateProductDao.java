package nlayeredData.dataAccess.concretes;

import nlayeredData.dataAccess.abstracts.ProductDao;
import nlayeredData.entities.concretes.Product;

import java.util.List;

public class HibernateProductDao implements ProductDao {


    @Override
    public void add(Product product) {
        System.out.println("has been added with hibernate: "+product.getName());
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
