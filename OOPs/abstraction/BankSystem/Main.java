public class Main{

    public static void main(String[] args){

        Bank sbi = new SBI("SBI");
        Bank hdfc = new HDFC("HDFC");
        Bank icici = new ICICI("ICICI");

        sbi.displayBankName();
        System.out.println("Interest Rate : " + sbi.getRateOfInterest() + "%");
        hdfc.displayBankName();
        System.out.println("Interest Rate : " + hdfc.getRateOfInterest() + "%");
        icici.displayBankName();
        System.out.println("Interest Rate : " + icici.getRateOfInterest() + "%");

    }

}