public class SalesAssociate extends Person{
    
    private double bonus = 0;
    private double totalSalary = (double) baseSalary + bonus;
    public SalesAssociate(String name, int age, int baseSalary){
        super(name, age, baseSalary);
        System.out.println("----Sales Associate has been added!----");
        showEmployeeInfo();
    }

    public void showEmployeeInfo(){
        System.out.print("Name: " + this.name + " -- Age: " + this.age + " -- Base Salary: BDT " + this.baseSalary + " -- Bonus: BDT ");
        System.out.println(this.bonus + " -- Total Salary: BDT " + totalSalary);
    }

    public void sellProduct(int id, int quantity, Store store){
        Product p = store.products.get(id - 1);
        //if (quantity > p.quantity){
          //  System.out.println()
        //}

    }


}
