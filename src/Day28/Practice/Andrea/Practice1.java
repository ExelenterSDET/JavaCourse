package Day28.Practice.Andrea;
import java.util.Arrays;

public class Practice1 {

    public static void main(String[] args) {
        getCount2("aba", "cat", "aba", "bad", "CAT", "CAt", "aba", "bad", "Bad", "cat", "aba", "ABA", "bAD");
        getCount("aba", "cat", "aba", "bad", "CAT", "CAt", "aba", "bad", "Bad", "cat", "aba", "ABA", "bAD");
    }
    static boolean equalsToLowerCase(String strA, String strB) {
        return (strA.toLowerCase().equals(strB.toLowerCase()));
    }
    static int countStrings(String str, String... args) {
        int counter = 0;
        for (String arg : args) {
            counter += equalsToLowerCase(str, arg) ? 1 : 0;
        }
        return counter;
    }

    static void getCount(String...args){
        String storageOutput = "";
        for (int i = 0; i < args.length; i++) {
            int countOfString = countStrings(args[i], args);
            String tempStorage = args[i].toLowerCase() + " = " + countOfString + " ";
            storageOutput += storageOutput.contains(tempStorage) ? "" : tempStorage;
        }
        System.out.println(storageOutput);
    }
    static void getCount2(String...args){
        Arrays.sort(args);
        System.out.println(Arrays.toString(args));
        String storageOutput = "";
        for (int i = 0; i < args.length-1; i++) {
            if (args[i].equalsIgnoreCase(args[i+1])) {
                continue;
            }
            int count = countStrings(args[i], args);
            storageOutput += storageOutput;

        }
        storageOutput += args[args.length-1].toLowerCase()+ " = " + countStrings(args[args.length-1] + ": ");
        System.out.println(storageOutput);
    }
}

