public class Main{

    public static void main(String[] args){

        Employee[] employees = {

            new Manager("Man1", 100000),
            new Manager("Man2", 80000),
            new Developer("Dev1", 40000),
            new Developer("Dev2", 30000),
            new Developer("Dev3", 20000)

        };

        for (Employee emp : employees){
            emp.displayDetails();
        }


    }

}