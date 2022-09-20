package Day30.Practice.Andrea;

public class UseReturnWithinTheLoop {

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11};
        int number = 10;
        boolean b = hasNumber(number, arr);
        System.out.println("b = " + b);

    }
    static boolean hasNumber(int number, int[] arr){
        for (int num : arr) {
            if(number == num){
                return true;
            }
        }
        return false;
    }
}
