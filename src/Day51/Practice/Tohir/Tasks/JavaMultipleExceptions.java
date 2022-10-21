package Day51.Tohir.Tasks;

import static Day51.Java.Task.JavaMultipleExceptionHandling.str;

public class JavaMultipleExceptions {
    public static void main(String[] args) {

        try {
            int nub = Integer.parseInt(str);
        }catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException.getMessage());
        }catch (IndexOutOfBoundsException indexOutOfBoundsException){
            System.out.println(indexOutOfBoundsException);
        }catch (NumberFormatException numberFormatException){
            System.out.println(numberFormatException);
        }
        catch (Exception exception){
            System.out.println(exception);
        }
    }
}
