class Developer extends Employee{

    Developer(String name, double salary){
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return 0.1 * salary;
    }
    
}