package Day50.Java;

public class JavaExceptions {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 0;

        try{
            int result = num1/num2;
            System.out.println("Try Block");
        }catch(RuntimeException e){
            System.out.println(e);
            System.out.println("Catch Block");
        }finally{
            System.out.println("Finally Block");
        }

        System.out.println("We still want this code to be ran");

        try{
            int result = num1/num2;
            System.out.println("Try Block");
        }catch(Exception e){
            System.out.println("Catch Block");
        }

//        try{
//            int result = num1/num2;
//            System.out.println("Try Block");
//        }finally{
//            System.out.println("Finally Block");
//        }
    }
}
