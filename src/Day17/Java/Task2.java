package Day17.Java;

public class Task2 {
    /*
    utsuajtdxkgmegdziphdmghhdcbxlzgjtxqmgahmugmvbzwang
    print every character and count how many times it appears in the string
     */

    public static void main(String[] args) {
       String str = "utsuajtdxkgmegdziphdmghhdcbxlzgjtxqmgahmugmvbzwang";

       String toAvoidDuplicates = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(toAvoidDuplicates.contains(String.valueOf(ch))){
                continue;
            }
            toAvoidDuplicates += ch;

            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if(ch == str.charAt(j)){
                    counter++;
                }
            }
            System.out.println("" + ch + " = " + counter);

        }

    }
}
