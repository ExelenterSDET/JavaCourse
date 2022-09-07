package Day21.Practice;

public class Dilnoza {
    /*
     Homework:
     String[][] arr = {{"apple", "watermelon", "grapes"},
                       {"math", "geometry", "chemistry","science","algebra"},
                       {"london", "istanbul", "washington", "mexico"}};
     Return all string in the camel case format.
     example: apple => Apple, math => Math, london => London
      */ public static void main(String[] args) {

          String[][] arr = {{"apple", "watermelon", "grapes"},
                    {"math", "geometry", "chemistry","science","algebra"},
                    {"london", "istanbul", "washington", "mexico"}};
            String str = "";

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    str=arr[i][j];
                    System.out.println(str.substring(0,1).toUpperCase()+str.substring(1));

                }
            }
    }
}
