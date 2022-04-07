import java.util.*;
public class Manager extends Person{

    public Manager(String name, int age, int baseSalary){
        super(name, age, baseSalary);
        System.out.println("----Manager has been added!----");
        showEmployeeInfo();
    }

    public void showEmployeeInfo(){
        System.out.println("Name: " + this.name + " -- Age: " + this.age + " -- Base Salary: BDT " + this.baseSalary);
    }

    public void addProduct(int id, String name, int price, int quantity, int minimumQuantity, int requisitedAmount, Store store){
        store.products.add(new Product(id, name, price, quantity, minimumQuantity, requisitedAmount));
        System.out.println("----Product has been added!----");
        System.out.println("ID: " + id + " -- Product Name: " + name + " -- Price: BDT " + price + " -- Qty: " + quantity + " -- Min.Qty: " + minimumQuantity + "-- Req. Amt. : " + requisitedAmount);

    }


}