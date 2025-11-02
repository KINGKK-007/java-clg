abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    void displayDetails(){
        System.out.println("Employee Name: " + name);
        System.out.printf("Base Salary: %,.1f\n", salary);
        System.out.printf("Bonus: %,.1f\n", calculateBonus());
    }

    abstract double calculateBonus();
}
