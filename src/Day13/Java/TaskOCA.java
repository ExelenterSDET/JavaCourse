package Day13.Java;

public class TaskOCA {
    public static void main(String[] args) {

        String staff = "TV";
        String res = null;

        res = staff.equals("TV") ? "Walter" : staff.equals("Movie") ? "White" : "No Result";
        System.out.println(res);


    }
}
