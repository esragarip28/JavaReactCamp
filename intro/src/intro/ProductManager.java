package intro;

public class ProductManager {

    public void addCart(Product product){
        System.out.println("has been added to cart : \n "+product.getId()+" "+product.getName()+" "+product.getUnitPrice()
        +" "+product.getDetail());
    }

}
