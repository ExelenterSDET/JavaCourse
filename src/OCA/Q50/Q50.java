package OCA.Q50;

public class Q50 {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Java");
        System.out.println(str);

        str.delete(0, str.length());
        System.out.println(str);
    }
}
