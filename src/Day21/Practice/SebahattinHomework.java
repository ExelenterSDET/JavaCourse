package Day21.Practice;

public class SebahattinHomework {
    public static void main(String[] args) {
        String[][] arr = {{"apple", "watermelon", "grapes"},
                {"math", "geometry", "chemistry","science","algebra"},
                {"london", "istanbul", "washington", "mexico"}};

        String []str = new String[3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                str[i] = arr[i][j];
                System.out.println(str[i].substring(0,1).toUpperCase()+str[i].substring(1));
            }
        }
    }
}
