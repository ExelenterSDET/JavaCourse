package Day12.Practice;

public class arthur12Day {

    public static void main(String[] args) {

//        char c = 35;
//        char c = 36;
        char c = 37;
//        char c = 38;

        String output = "";

        switch(c) {
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
                output = "WRONG INPUT";
                break;
        }

        System.out.println("output = " + output);


    }
}
