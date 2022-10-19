package Day51.Practice.Sebahattin;

public class JavaException {
    public static void main(String[] args) {
        try {
            ageChecker3(9);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Unchecked Exception Handling example");
        }
    }
        public static void ageChecker3(int age){
            if(age<10){
                throw new RuntimeException("Too young to go to the cinema alone");
            } else if(age<18){
                throw new RuntimeException("Must go to the cinema with adults");
            } else {
                System.out.println("You can do what you want. ");
            }

        }

}