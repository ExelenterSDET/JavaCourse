package Day51.Java.Task;

public class JavaMultipleExceptionHandling {
    public static String str;
    public static void main(String[] args) {

//        String str = "a";
        try {
            int number = Integer.parseInt(str);
        } catch (NumberFormatException numberEx){
            System.out.println(numberEx);
        } catch (IllegalArgumentException illegalArgumentEx){
            System.out.println(illegalArgumentEx);
        } catch (IndexOutOfBoundsException indexEx){
            System.out.println(indexEx);
        } catch (NullPointerException nullEx){
            System.out.println(nullEx);
        } catch (RuntimeException runtimeEx){
            System.out.println(runtimeEx);
        } catch (Exception ex){
            System.out.println(ex);
        }
//        System.out.println(number);



    }
}
