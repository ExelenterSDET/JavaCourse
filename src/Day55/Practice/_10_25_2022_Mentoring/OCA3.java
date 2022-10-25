package Day55.Practice._10_25_2022_Mentoring;

import java.io.StringBufferInputStream;

class OCA3 {
public static String maskCC(String creditCard){
    String x = "XXXX-XXXX-XXXX-";
    StringBuilder sb = new StringBuilder(x);
    sb.append(creditCard, 15, 19);
    return sb.toString();
}

    public static void main(String[] args) {
        System.out.println(maskCC("1234-5678-9101-1121"));
    }
}
