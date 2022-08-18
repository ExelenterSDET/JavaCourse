package Day8.Practice;

public class arthur8Day {
    public static void main(String[] args) {
//        int arr = {1,2,3};
//       String str = "HELLo my name is Arthur";
        String trimstr = "            heloo             ";
        String email = "getrich11@yahoo.com";

//       boolean e = str.startsWith("Hello");
//       System.out.println(e);
//       String str2 = "java is fun";
//       str2.startsWith("is", 5);
//       boolean r = str.endsWith("ld");
//       String s = str.toLowerCase();
//       String s = str.toUpperCase();
//       String s = str.toString();
        //String s =
//        String s = trimstr.trim();
//        String[] split = email.split("@");

//        System.out.println(Arrays.toString(split));
//        System.out.println(Arrays.toString);

        String str = "123 Anywhere street";
//        String newstr = str.substring(8).toLowerCase().replace('u','a');
        // String replacestr = str.replace('T','E');

        String newstr = str.replaceAll("[^0-9].", "*"); //replace everything except(^)numbers

        System.out.println(newstr);

       // String s = str.replaceFirst(s);




    }
}
