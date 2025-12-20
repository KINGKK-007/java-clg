public class Test{

    public static void main(String[] args){

        if(args.length >=4){
            System.out.println("First  : " + args[0]);
            System.out.println("Seocnd : " + args[1]);
            System.out.println("Third  : " + args[2]);
            System.out.println("Fourth : " + args[3]);
        }
        else {
            System.out.println("Please provide four arguments!");
        }

    }

}