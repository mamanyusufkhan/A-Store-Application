import java.util.*;
public class User{
    public static void main(String[] args){
        Store myStore = new Store();
        Manager michaelScott = new Manager("Michael Scott", 42, 40000);
        SalesAssociate jimHalpert = new SalesAssociate("Jim Halpert", 28, 30000);
        SalesAssociate pamBeesly = new SalesAssociate("Pam Beesly", 25, 30000);
        
        linespacing();

        michaelScott.addProduct(1, "Logitech G304", 3400, 10, 2, 5, myStore);
        michaelScott.addProduct(2, "AMD Ryzen 3600", 17000, 20, 5, 7, myStore);
        michaelScott.addProduct(3, "Nvidia Geforce RTX 3090", 151000, 10, 3, 4, myStore);
        linespacing();
        myStore.showStoreDetails();
        linespacing();
        michaelScott.showEmployeeInfo();
        jimHalpert.showEmployeeInfo();
        pamBeesly.showEmployeeInfo();

    }

    public static void linespacing(){
        System.out.println();
        System.out.println();
    }
}