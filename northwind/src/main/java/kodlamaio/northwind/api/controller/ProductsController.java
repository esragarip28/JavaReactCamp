package kodlamaio.northwind.api.controller;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@EnableAutoConfiguration
@Configuration
@RestController
@RequestMapping("/api/products")
public class ProductsController {

    private ProductService productService;

    // scanning project and trying to find  productservice
    @Autowired
    public ProductsController(ProductService productService) {
        super();
        this.productService = productService;
    }

    //get and post are http requests

    @GetMapping("/getall") //get method is used to get data
    public DataResult<List<Product>> getAll(){
        return this.productService.getAll();

    }
    @PostMapping("/add")
    public Result add(@RequestBody Product product){
        return this.productService.add(product);
    }

}
