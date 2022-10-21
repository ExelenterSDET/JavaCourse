package Day50.JavaExceptions.Tasks;

public class StringErrorException {
    public static void main(String[] args) {
        String string = "My code";

        try {
            String string0 = string.substring(3,20);
            System.out.println(string0);
        } catch (StringIndexOutOfBoundsException e){
            System.out.println(e+"\n");
        }
    }
}
