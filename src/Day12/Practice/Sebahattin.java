package Day12.Practice;

public class Sebahattin {
    public static void main(String[] args) {
        char ch = '#';
        String output = "";

        switch (ch){
            case '#':
                output = "HASHTAG";
                break;
            case '$':
                output = "DOLLAR";
                break;
            case '%':
                output = "PERCENT";
                break;
            case '&':
                output = "AND";
                break;
            default:
                output ="WRONG INPUT";
        }
        System.out.println(output);
    }
}
