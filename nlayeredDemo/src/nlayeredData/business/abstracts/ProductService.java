package nlayeredData.business.abstracts;

import nlayeredData.entities.concretes.Product;

import java.util.List;

public interface ProductService {

    void add (Product product);
    List<Product> getAll();

}
