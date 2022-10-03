package Day39.Practice.Ibrahim.Saturday.Task3;

public class Task3 {
    public static void main(String[] args) {
        String str = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbacccccddddddddddddddddccccccccccccccaaaddddaacccccccccccccccccccccccccccccccccccccccccccccccccc";
        Task3 jv = new Task3();
        jv.getMostConsRepeated(str);
    }
    public char getMostConsRepeated(String str){
        char ch = 0;
        int counter2 = 0;

        for (int i = 0; i < str.length(); i++) {
            int counter1 = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter1++;
                    if (counter2 < counter1){
                        counter2 = counter1;
                        ch = str.charAt(i);
                    }
                } else if (str.charAt(i) != str.charAt(j)) {
                    i = j; break;
                }
            }
        }
        System.out.println(ch + " : " + counter2);
        return ch;
    }

}
