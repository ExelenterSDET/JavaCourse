package Day22.Java;

public class OCA6 {
    public static void main(String[] args) {
        String shirts [] [] = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";
        // line n1
        for(String[] c : shirts){
            for(String s : c){
                System.out.print(s + ":");
            }
        }
    }
}
