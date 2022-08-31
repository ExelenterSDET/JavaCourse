package Day17.Java;

public class JavaNestedLoop {

    public static void main(String[] args) {
        String str = "ABC";
        int number = 5;

        // task to print A1 A2 A3 A4 A5 B1 B2 B3 B4 ....
        for (int i = 0; i < str.length(); i++) { // A -> B -> C
            for (int j = 1; j <= number; j++) { // 1 2 3 4 5
                System.out.print("" + str.charAt(i)+j + " ");
            }
            System.out.println();
        }


    }

}
