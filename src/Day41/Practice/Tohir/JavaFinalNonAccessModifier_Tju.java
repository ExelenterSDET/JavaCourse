package Day41.Practice.Tohir;

public class JavaFinalNonAccessModifier_Tju {
   public final long ssn;
   public String antg;

    public JavaFinalNonAccessModifier_Tju(long ssn, String antg) {
        this.ssn = ssn;
        this.antg = antg;
    }

    public JavaFinalNonAccessModifier_Tju(long ssn) {
        this.ssn = ssn;
    }
    public JavaFinalNonAccessModifier_Tju() {
        this.ssn = 123;
    }


    @Override
    public String toString() {
        return "JavaFinalNonAccessModifier_Tju{" +
                "ssn=" + ssn +
                ", antg='" + antg + '\'' +
                '}';
    }

}
   class Test{
       public static void main(String[] args) {
           JavaFinalNonAccessModifier_Tju javaFinalNonAccessModifier_tju = new JavaFinalNonAccessModifier_Tju(232323224454L);
           System.out.println(javaFinalNonAccessModifier_tju);
           JavaFinalNonAccessModifier_Tju javaFinalNonAccessModifier_tju1 = new JavaFinalNonAccessModifier_Tju();
           System.out.println(javaFinalNonAccessModifier_tju1);
           JavaFinalNonAccessModifier_Tju javaFinalNonAccessModifier_tju2 = new JavaFinalNonAccessModifier_Tju(232323224454L,"Smith");
           System.out.println(javaFinalNonAccessModifier_tju2);


       }
   }
