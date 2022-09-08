package Day21.Practice;

public class Andrea {
    public static void main(String[] args) {
//        Homework:
//        String[][] arr = {{"apple", "watermelon", "grapes"},
//                {"math", "geometry", "chemistry","science","algebra"},
//                {"london", "istanbul", "washington", "mexico"}};
//        Return all string in the camel case format.
//                example: apple => Apple, math => Math, london => London

        String[][] arr = {{"apple", "watermelon", "grapes"},
                {"math", "geometry", "chemistry","science","algebra"},
                {"london", "istanbul", "washington", "mexico"}};

        for (int i = 0; i < arr.length; i++) { //length of rows
            for (int j = 0; j < arr[i].length; j++) { //length of columns
                System.out.println(arr[i][j].substring(0,1).toUpperCase() + arr[i][j].substring(1));
            }
        }
    }
}
