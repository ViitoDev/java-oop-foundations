package Class2.Exercise3;

public class Main {
    static void main() {
        Product product = new Product("MacBook Air", 3500);
        System.out.println("Product name : " + product.getName());
        System.out.println("Price        : " + product.getPrice());
        System.out.println("-------------------------");
        product.applyDiscount(50);
        System.out.println("Product name : " + product.getName());
        System.out.println("Price        : " + product.getPrice());
    }
}
