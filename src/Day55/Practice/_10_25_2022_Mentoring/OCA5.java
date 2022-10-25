package Day55.Practice._10_25_2022_Mentoring;

public class OCA5 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s = "Java";
        if (sb.toString().equals(s.toString())){
            System.out.println("Match 1");
        } else if (sb.equals(s)) {
            System.out.println("Match 2");
        }
    }
}
