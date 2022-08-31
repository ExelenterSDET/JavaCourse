package Day17.Java;

public class Task6 {

    public static void main(String[] args) {
        String str = "xyz";
        String str2 = "utsuyajtdxkygzmegxydzipyhdmghzhdcxbxlzygjtxzqmgyahmxyugmvbzwang";

        // return how many x, y and z appears in that string.
        for (int i = 0; i < str.length(); i++) {
            char outerChar = str.charAt(i);
            int counter = 0;
            for (int j = 0; j < str2.length(); j++) {
                char innerChar = str2.charAt(j);
                counter += outerChar == innerChar ? 1 : 0;
            }
            System.out.println(str.charAt(i) + "=" + counter);
        }
    }
}
