class Product {
    int productId;

    Product(int id) {
        productId = id;
    }

    void showDetails() {
        System.out.println("Product ID: " + productId);
    }
}

class Electronics extends Product {
    int warranty;

    Electronics(int id, int warranty) {
        super(id);              
        this.warranty = warranty;
    }

    void showDetails() {
        super.showDetails();  
        System.out.println("Warranty: " + warranty + " years");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Electronics e = new Electronics(101, 2);
        e.showDetails();
    }
}
