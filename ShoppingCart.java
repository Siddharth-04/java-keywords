class Product{
    static int discount = 10;
    String productName;
    double price;
    int quantity;
    final String productId;

    public Product(String productName, double price, int quantity,String productId) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productId = productId;
    }

    static void updateDiscount(int newDiscount){
        discount = newDiscount ;
    }

    public void displayDetails(){
        if(this instanceof Product){
            System.out.println("Product ID: " + productId);
            System.out.println("Product Name: " + productName);
            System.out.println("Product Price: " + price);
            System.out.println("Product Quantity: " + quantity);
        }
    }

}
public class ShoppingCart {
    public static void main(String[] args) {
        Product product1 = new Product("Washing Powder", 100.00, 10, "1WP98790");
        Product product2 = new Product("Laptop", 50000.60, 1, "1LT98709");
        product1.displayDetails();
        product2.displayDetails();
        Product.updateDiscount(15);
        System.out.println("Discount updated !");
    }
}

//Product Name: Washing Powder
//Product Price: 100.0
//Product Quantity: 10
//Product ID: 1LT98709
//Product Name: Laptop
//Product Price: 50000.6
//Product Quantity: 1
//Discount updated !
