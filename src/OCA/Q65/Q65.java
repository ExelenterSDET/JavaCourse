package OCA.Q65;

public class Q65 {
    public static void main(String[] args) {

        String x = maskCC("1234-5678-9101-1112");

        System.out.println(x);

    }

    public static String maskCC(String creditCard){
        String x = "xxxx-xxxx-xxxx-";
        StringBuilder sb = new StringBuilder(creditCard);
        sb.insert(0, x);
        return sb.toString();
    }
}
