abstract class Person{

    protected String name;
    protected int age;
    protected int baseSalary;

    public Person(String name, int age, int baseSalary){
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
    }

    abstract void showEmployeeInfo();


}