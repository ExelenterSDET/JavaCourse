package Day50.Practice.Andrea;

public class ExceptionExample {
    public static void main(String[] args) {

        String str = "hello";
        try{
            System.out.println(str.charAt(6));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
    }
}
