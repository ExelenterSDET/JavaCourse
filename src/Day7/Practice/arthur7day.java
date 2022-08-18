package Day7.Practice;

public class arthur7day {

    public static void main(String[] args) {
        String str1 = "JAVA ";
        String str2 = " IS ";
        String str3 = "FUN";
        String str5 = "";
        String str6 = "java ";
        String str4 = str1.concat(str2).concat(str3);
        System.out.println(str4);
        System.out.println(str4.length());
        System.out.println(str4.indexOf("I"));
        System.out.println(str4.charAt(str4.length()-1));
        System.out.println(str4.contains("JAVA"));
        System.out.println(str5.isEmpty());
        System.out.println(str4.substring(0,4));
        System.out.println(str1.equals(str6));
        System.out.println(str1.equalsIgnoreCase(str6));

    }

}
