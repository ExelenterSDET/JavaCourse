package Day21.Practice;

public class Bakhridin_HomeWork {
    public static void main(String[] args) {

              /*
        Homework:
    String[][] arr = {{"apple", "watermelon", "grapes"},
                      {"math", "geometry", "chemistry","science","algebra"},
                      {"london", "istanbul", "washington", "mexico"}};
    Return all string in the camel case format.
    example: apple => Apple, math => Math, london => London
         */

        String[][] arr = {{"apple", "watermelon", "grapes"},
                {"math", "geometry", "chemistry","science","algebra"},
                {"london", "istanbul", "washington", "mexico"}};

        for (String[] strings : arr) {
            for (String newArr : strings) {
                System.out.println(newArr.substring(0,1).toUpperCase().concat(newArr.substring(1)));
            }
        }

    }
}
