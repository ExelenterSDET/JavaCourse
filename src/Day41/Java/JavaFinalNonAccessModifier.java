package Day41.Java;

public class JavaFinalNonAccessModifier {
    public final long ssn;
    public String antg;

    public JavaFinalNonAccessModifier(long ssn) {
        this.ssn = ssn;
    }

    public JavaFinalNonAccessModifier() {
        this.ssn = 1234;
    }

    public JavaFinalNonAccessModifier(long ssn, String antg) {
        this.ssn = ssn;
        this.antg = antg;
    }

    public String toString() {
        return "JavaFinalNonAccessModifier{" +
                "ssn=" + ssn +
                '}';
    }
}

class Test{
    public static void main(String[] args) {
        JavaFinalNonAccessModifier jfm = new JavaFinalNonAccessModifier(2261L);
        //jfm.ssn = 12;

        JavaFinalNonAccessModifier jfm2 = new JavaFinalNonAccessModifier();
        //jfm2.ssn = 10;
        JavaFinalNonAccessModifier jfm3 = new JavaFinalNonAccessModifier(2265544561L, "SMTG");
        //jfm3.ssn = 5;


        System.out.println(jfm);
        System.out.println(jfm2);
        System.out.println(jfm3);


    }
}
