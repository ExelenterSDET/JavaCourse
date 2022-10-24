package Day54.Practice._10_24_2022_Mentoring;

public class _01_String_recap {

    public static void main(String[] args) {
        String str = "";
        // Strings are immutable.
        // StringBuilder and StringBuffer? They are mutable

        String str1 = "a";
        String str2 = "a";

        String bcd = str1.concat("bcd");
        System.out.println("str1 = " + str1);

        boolean b = str1.equals(str2);
        System.out.println(b);

        StringBuilder sb = new StringBuilder();
        System.out.println("sb" + sb);
        sb.append("Hello");
        System.out.println("sb = " + sb);





    }



}
