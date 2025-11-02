public class ICICI extends Bank {

    double rateOfInterest = 7.0;

    ICICI(String name){
        this.name = name;
    }

    @Override
    double getRateOfInterest(){
        return rateOfInterest;
    }
    
}