package Day51.Tohir;

public class JavaExceptions {
    public static void main(String[] args) {
        System.out.println("Hello");
        //unchecked example
        try {
            ageChecker(15);
        }
        catch (RuntimeException e)
        {
            System.out.println(e.getMessage());
        }
        //checked example
        try {
            ageChecker2(10);
        } catch (NoSuchMethodException e) {
            System.out.println(e);
            System.out.println("checked exception example");
        }
        System.out.println("End of code");
    }

    public static void ageChecker(int age){
        if(age<10){
            throw new RuntimeException("Too young");
        } else if (age<15) {
            throw new RuntimeException("Go with parents");
        }else {
            System.out.println("You are free!");
        }
    }

    public static void ageChecker2(int age) throws NoSuchMethodException {
        if(age<10){
            throw new NoSuchMethodException("Too young");
        } else if (age<15) {
            throw new NoSuchMethodException("Go with parents");
        }else {
            System.out.println("You are free!");
        }
    }
}

