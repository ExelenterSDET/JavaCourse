package Day26.Practice;

public class Bakhridin_MethodOverloading {
    public static void main(String[] args) {

        String str="$42.5", str1="$50.5";
        double total = getTotal(str, str1);
        System.out.println("total = " + total);

        double total1 = getTotal(10, 20);
        System.out.println("total1 = " + total1);

    }

    public static double getTotal(String str, String str1) {
        double total=0;

        total=Double.parseDouble(str.replace("$",""))
                +Double.parseDouble(str1.replace("$",""));

        return total;
    }

    public static double getTotal(int a, int b) {
        return a+b;
    }
}
