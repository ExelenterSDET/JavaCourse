package Day44.Practice.Ibrahim.Saturday.Task4;

public class IsPalindrome {

    public static void main(String[] args){

        boolean isPalindrome = false;
        for(String arg : args){
            for(int i = 0; i < arg.length(); i++){
                if (arg.charAt(i) == arg.charAt(arg.length() - (1 + i))) {
                    isPalindrome = true;
                }
            }
        }
        System.out.println("isPalindrome = " + isPalindrome);
    }
}
