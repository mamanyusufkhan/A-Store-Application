import java.util.ArrayList;

public class Store{
    ArrayList<Product> products = new ArrayList<Product>();
    public Store(){
        System.out.println("----Store has been generated successfully!----");
    }

    public void showStoreDetails(){
        System.out.println("----Inventory Details----");
        for (Product p: products){
            System.out.println("ID: " + p.id + " -- Product Name: " + p.name + " -- Price: BDT " + p.price + " -- Qty: " + p.quantity + " -- Min.Qty: " + p.minimumQuantity + "-- Req. Amt. : " + p.requisitedAmount);
        }
    }

}