package Day17.Java;

public class Task3 {
    public static void main(String[] args) {
        String str = "utsuajtdxkgmegdziphdmghhdcbxlzgjtxqmgahmugmvbzwang";
        String toAvoidDuplicates = "";
        for(int i = 0; i < str.length();i++) {
            char ch = str.charAt(i);
            if(toAvoidDuplicates.contains(String.valueOf(ch))){
                continue;
            }
            toAvoidDuplicates += ch;
            String temporary = str.replace(String.valueOf(ch),"");
            System.out.println(""+ch + " = " + (str.length()-temporary.length()));

        }
    }
}
