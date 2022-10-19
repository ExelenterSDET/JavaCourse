package Day51.Java;

public class JavaExceptions2 {
    public static void main(String[] args){
        // unchecked example
        try {
            ageChecker(9);
        }catch(Exception e){
            System.out.println(e);
            System.out.println("Unchecked Exception Handling example");
        }

        // checked example
        try {
            ageChecker2(9);
        } catch (NoSuchMethodException e) {
            System.out.println(e);
            System.out.println("Checked Exception Example");
        }
        System.out.println("End of the code");
    }

    public static void ageChecker(int age){
    if(age<10){
        throw new RuntimeException("Too young to go to the cinema alone");
    } else if(age<18){
        throw new RuntimeException("Must go to the cinema with adults");
    } else {
        System.out.println("You can do what you want. ");
    }

    }

    public static void ageChecker2(int age) throws NoSuchMethodException {
        if(age<10){
            throw new NoSuchMethodException("Too young to go to the cinema alone");
        } else if(age<18){
            throw new NoSuchMethodException("Must go to the cinema with adults");
        } else {
            System.out.println("You can do what you want. ");
        }

    }
}
