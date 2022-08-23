package Day10.Saturday_Project_Bakhridin;

public class Task_14 {
    public static void main(String[] args) {
        /**Task14
         * Create a string. Validate if a string has a space. (use maximum 1 spaces in the string)
         * if string doesn't have a space, return the string itself.
         * if string has a space, get two words to the left from the space and to the right from the space.
         * Validate which word is the longest and print it.
         * if words have equal length, return the whole string.
         * Example:
         * Hello World = Hello = 5, World = 5 Output should be "Hello World"
         * Exelenter Sdet = Exelenter = 9, Sdet = 4 Ouput should be "Exelenter"
         */

        String str="Hello World";

        if (!str.contains(" ")) {
            System.out.println(str);
        }
        if (str.contains(" ")) {
            String substring1 = str.substring(0, 6);
            System.out.println("String contains space "+substring1);
            String substring2 = str.substring(6);
            System.out.println("String contains space "+substring2);


        }

    }

}
