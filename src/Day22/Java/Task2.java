package Day22.Java;

public class Task2 {

    /*
    Create a method which will take two parameters.
    1. parameter will be length of array. (int)
    2. parameter will be boolean (isEven)

     */
    public static void main(String[] args) {

        int length = 10;
        boolean isEven = false;
//        printEvenOrOdd(length, isEven );
        // if isEven is true, output should be 0,2,4,6,8,10
        // if isEven is false, output should be 1,3,5,7,9
//        printEvenOrOdd2(length,isEven);
        printEvenOrOdd3(length, isEven);

    }
    static void printEvenOrOdd(int length, boolean isEven){
        for (int i = 0; i <= length; i++) {
            if(isEven){
                if(i%2==0){
                    System.out.println(i);
                }
            }else{
                if(i%2!=0){
                    System.out.println(i);
                }
            }
        }
    }

    static void printEvenOrOdd2(int length, boolean isEven){
        for (int i = 0, j = 1; i <= length; i+=2, j+=2) {
            if(isEven){
                System.out.println(i);
            }else{
                System.out.println(j);
            }

        }
    }

    static void printEvenOrOdd3(int length, boolean isEven){
        for (int i = isEven ? 0 : 1; i <= length; i+=2) {
            System.out.println(i);
        }
    }
}
