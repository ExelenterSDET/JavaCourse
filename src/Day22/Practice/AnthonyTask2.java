package Day22.Practice;

public class AnthonyTask2 {
    /*
    Create a method which will take two parameters.
            1. parameter will be length of array
2. parameter will be boolean (isEVEN)
 */
    public static void main(String[] args) {
        System.out.println("-----------------------TASK 2 --------------------------------");
        int length = 20;
        boolean isEven = true;
        printEvenOrOdd(length, isEven);
        //int[] arr = {1,2,3,4,5,6,7,8,9,10};

    }
    static void printEvenOrOdd (int length, boolean isEven) {
        for (int i =0; i <= length; i++ ){
            if(isEven){
                if(i%2==0){
                    System.out.print(i + ", ");
                }
            }else{
                if(i%2!=0){
                    System.out.print(i + ", ");
                }
            }
        }
    }
}
