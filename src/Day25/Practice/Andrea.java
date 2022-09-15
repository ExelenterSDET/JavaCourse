package Day25.Practice;

public class Andrea {

    public static void main(String[] args) {


        //while loop
        String str = "Hello world";
        int index = 0;

        while (str.charAt(index) != 'w') {
            System.out.println(str.charAt(index));
            index++;
        }

        String str2 = "Hello world Hello world Hello world Hello world Hello world";
        boolean condition = true;
        int ind = 0;

        while (condition) {
            System.out.print(str2.charAt(ind));

            if (++ind == 20) {
                condition = false;
            }
        }
        System.out.println("");
    }
}
