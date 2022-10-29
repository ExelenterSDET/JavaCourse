package Day56.Practice.Andrea.Mentoring;

public class StringBuilderExamples {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();
        String str2 = sb1.toString();
        System.out.println(str1==str2);

        StringBuilder sb = new StringBuilder("Java");
        String s = "Java";

        if (sb.toString().equals(s.toString())){
            System.out.println("Match1");
        } else if (sb.equals(s)){
            System.out.println("Match2");
        }
        else {
            System.out.println("No Match");
        }
    }
}
