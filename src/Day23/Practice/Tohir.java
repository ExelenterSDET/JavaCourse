package Day23.Practice;

public class Tohir {

    public static void main(String[] args) {
        Tohir jm = new Tohir();
        System.out.println("SUM = " + SUM(3,5));
        int[] num = {2,4,7,8,99};
        System.out.println("Max(num) = " + Max(num));
        System.out.println("Min(num) = " + Min(num));
        System.out.println("valid() = " + valid("12345678"));
        System.out.println("valid() = " + Tohir.valid1("1234567"));
    }
    static int Min(int num[]){

        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i] < min){
                min = num[i];
            }
        }
        return min;
    }
    static int Max(int num[]){

        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i] > max){
                max = num[i];
            }
        }
        return max;
    }
    static int SUM(int A, int B){

        return A+B;
    }
    static boolean valid(String s){
        if (s.length()>7){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean valid1(String s){
        if (s.length()>7){
            return true;
        }
        else {
            return false;
        }
    }
}
