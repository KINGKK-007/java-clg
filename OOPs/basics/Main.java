public class Main{

    public static void main(String[] args){

        Car car = new Car();

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.printf("%,.2f\n", car.price);
        
    }
    
}