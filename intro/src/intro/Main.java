package intro;

public class Main {
    public static void main(String[] args) {
        /*
        Product product1=new Product(); //örnek olusturma , referans olusturma ,instance olusturma
        product1.id=1;
        product1.name="Lenovo V14";
        product1.unitPrice=15.000;
        product1.detail="16 GB Ram";

        */
        Product product1=new Product(1,"Lenovo V14",15.000,"16 GB Ram",10);
        Product product2=new Product();
        product2.setId(2);
        product2.setName("Lenovo 15");
        product2.setDetail("16 GB Ram");
        product2.setDiscount(10);
        product2.setUnitPrice(16000);
        System.out.println(product2.getUnitPriceAfterDiscount());

        /*
        ProductManager productManager=new ProductManager();
        productManager.addCart(product1); //productları adres olarak yollamıs oluyoruz...
        productManager.addCart(product2);
        productManager.addCart(product3);

         */



    }
}
