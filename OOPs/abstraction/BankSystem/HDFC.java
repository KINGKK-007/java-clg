class HDFC extends Bank {

    double rateOfInterest = 6.8;

    HDFC(String name){
        this.name = name;
    }

    @Override
    double getRateOfInterest(){
        return rateOfInterest;
    }

}
