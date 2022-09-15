package Day27.Java;

public class JavaVarArgs2 {
    /*
    Each method can only have one varargs
    parameter

    2. The varargs argument must be the last
    parameter

     */
    public static void main(String... args) {
        int n1 = 10;
        int n2 = 20;
        int n3 = 30;

        JavaVarArgs2 ja = new JavaVarArgs2();
        System.out.println(ja.getTotal(n1, n2, n3, 50, 30, 100, 200, 500));
    }

    int getTotal(int... numbers){
        int total = 0;

        for (int number : numbers) {
            total += number;
        }
        return total;
    }


    String getText(String s, int num, double d, boolean bl, int... a){
        return "";
    }
}
