package Day27.Practice;

public class Andrea {

    public static void main(String[] args) {
        String str = "aba, cat, aba, bad, CAT, CAt, aba, bad, Bad, cat, aba, ABA, bAD";

    }
    static boolean equalsToLowerCase(String strA, String strB) {
        return (strA.toLowerCase().equals(strB.toLowerCase()));
    }

    static int countStrings(String str, String... args) {
        int counter = 1;
        for (int i = 0; i < args.length; i++) {
            if (equalsToLowerCase(str, args[i])) {
                counter++;
            }

        }
        return counter;
    }
}

 /*   static void getCount(String...args){

        int counter = 0;
        for (int i = 0; i < args.length-1; i++) {
            if (equalsToLowerCase(args[i], args[i+1])){
                counter++;
            }

        }
        getCount("aba", "cat", "aba", "bad", "CAT", "CAt", "aba", "bad", "Bad", "cat", "aba", "ABA", "bAD");
        System.out.println(counter);
        //System.out.println(getCount("aba", "cat", "aba", "bad", "CAT", "CAt", "aba", "bad", "Bad", "cat", "aba", "ABA", "bAD"));
    }
}
*/




