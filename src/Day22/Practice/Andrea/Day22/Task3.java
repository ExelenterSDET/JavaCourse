package Day22.Practice.Andrea.Day22;

public class Task3 {
    public static void main(String[] args) {
        int length = 21;
        boolean isEven = true;
        printEvenOrOdd(length, isEven);
    }
    static void printEvenOrOdd(int length, boolean isEven){
        if (length%2 == 0){
           for (int i = 0; i <= length ; i+=2) {
                System.out.println("i = " + i);
            }
        }
        else{
            isEven = false;
            for (int i = 1; i <= length; i+=2) {
                System.out.println("i = " + i);
            }
        }
        System.out.println(isEven);

    }
}
