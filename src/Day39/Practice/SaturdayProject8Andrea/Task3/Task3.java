package Day39.Practice.SaturdayProject8Andrea.Task3;

public class Task3 {

//    Create a method which will take a String as a parameter and return type is char.
//    This method should return a character which is mostly consecutively repeated.
//
//            Example:
//    String = "aaaabbacccccdddccaaaddddaac"
//    Output should be c.
//
//    Explanation: c continuously / without breaking is repeated 5 times. more then a, b, or d.
//
//    note: This is a most recent interview question!!!


    public static void main(String[] args) {

        Task3 t3 = new Task3();
        String str = "aaaabbacccccdddccaaaddddaacffffff";
        System.out.println(t3.getMostRepeatedChar(str));

    }

    public char getMostRepeatedChar (String input){
        int counter = 0;
        char max = input.charAt(0);
        int tempCounter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (i<input.length()-1 && input.charAt(i) == input.charAt(i+1)) {
                   tempCounter++;
            }
            else {
                if (tempCounter > counter){
                    counter = tempCounter;
                    max = input.charAt(i);
                }
                tempCounter = 0;
            }
        }
        return max;
    }
}
