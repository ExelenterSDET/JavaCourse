package Day30.Java;

public class UseReturnWithinTheLoop {
    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9,10,12,14,16,20};
        int number = 12;
        boolean b = hasNumber(number, arr);
        System.out.println(b);
        boolean b1 = hasNumber2(number, arr);
        System.out.println(b1);
    }

    static boolean hasNumber(int number, int[] arr){
        boolean hasNumber = false;

        for (int num : arr) {
            if(number == num){
                hasNumber = true;
                break;
            }
        }

        return hasNumber;
    }

    static boolean hasNumber2(int number, int[] arr){
        for (int num : arr) {
            if(number == num){
                return true; // hasNumber = true, break;
            }
        }
        return false;
    }
}
