package Day6.Practice;

public class Malika {
    public static void main(String[] args) {
        String a = "Exelenter ";
        String b = "SDET";
        String c = a.concat(b);
        System.out.println(c);

        String s1 = "United ";
        String s2 = "States ";
        String s3 = "Of ";
        String s4 = "America";
        String s5 = s1.concat(s2+s3+s4);
        System.out.println(s5);

        String FullName = "Malika Sadykova";
        int MyFullName = FullName.length();
        System.out.println("MyFullName = " + MyFullName);

        String Country = "Istanbul";
        int MyCountry = Country.length();
        System.out.println("MyCountry = " + MyCountry);
    }
}
