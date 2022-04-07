public class Product{
    int id;
    String name;
    int price;
    int quantity;
    int minimumQuantity;
    int requisitedAmount;

    public Product(int id, String name, int price, int quantity, int minimumQuantity, int requisitedAmount){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.minimumQuantity = minimumQuantity;
        this.requisitedAmount = requisitedAmount; 
    }
    
}