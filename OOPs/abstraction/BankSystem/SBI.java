class SBI extends Bank {

    double rateOfInterest = 6.5;

    SBI(String name){
        this.name = name;
    }

    @Override
    double getRateOfInterest(){
        return rateOfInterest;
    }
    
}
