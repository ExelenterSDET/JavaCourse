package Day26.Practice;

public class Dilnoza {

    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "World";
        boolean condition = str.length() == str2.length() ? true : false;
        System.out.println("condition = " + condition);

        System.out.println(str.replaceAll("[A-Z]", "\\$"));
        System.out.println(str2.replaceAll("[A-Z]", "\\$"));


        String str3 = "$5.36,$3.47,4.15";

        String noSymbolNum = str3.replace("$", "").replace(",", " ");
        System.out.println("noSymbolNum = " + noSymbolNum);
        double total = 0;
        int space1 = 0, space2 = 0;

        space1 = noSymbolNum.indexOf(" ");
        space2 = noSymbolNum.lastIndexOf(" ");

        String noSymbolSubStr = noSymbolNum.substring(0, space1);
        String noSymbolSubStr2 = noSymbolNum.substring(space1, space2);
        String noSymbolSubStr3 = noSymbolNum.substring(space2);

        total = Double.parseDouble(noSymbolSubStr) + Double.parseDouble(noSymbolSubStr2) + Double.parseDouble(noSymbolSubStr3);

        System.out.println("noSymbolSubStr3 = " + total);
    }
}
