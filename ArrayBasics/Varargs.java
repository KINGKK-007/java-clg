public class Varargs {
    
    public static void main(String[] args){

        System.out.println(average(10, 20, 30));
        System.out.println(average(5, 5, 5, 5, 5));

        multiplyAll(2, 3, 4);
        multiplyAll(5);
        multiplyAll();
    }
    static void multiplyAll(int... nums){
        int prod = 1;
        for(int num : nums){
            prod *= num;
        }
        System.err.println("Product of nums is " + prod);
    }

    static double average(double... values){
        double sum = 0;
        int cnt = 0;
        for (double value : values){
            cnt++;
            sum += value;
        }
        return 1.0 * sum / cnt;
    }

}