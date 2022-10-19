package Day50.Practice.Dilnoza;

public class Task1 {

    public static void main(String[] args) {
/*
Create any Exception scenario with String
Catch it with try catch blocks
 */
                try {
                    String str = "Hello World";
                    System.out.println("str = " + str.charAt(0));

                } catch (IndexOutOfBoundsException exception) {

                    System.out.println("Length Out of Bounds");
                }
            }

        }

