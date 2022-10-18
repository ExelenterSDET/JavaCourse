package Day50.Java;

public class Task1 {
    public static void main(String[] args) {
        String str = "hello";
//        char c = str.charAt(6);
//        System.out.println(c);
        try{
            System.out.println(str.charAt(6));
        }catch(RuntimeException e){ // Runtime Exception == Unchecked Exception == Unexpected Exception
            System.out.println(e);
            System.out.println("Invalid index");
        }
    }
}
