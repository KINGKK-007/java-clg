class Manager extends Employee{

    Manager(String name, double salary){
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return 0.2 * salary;
    }

}
