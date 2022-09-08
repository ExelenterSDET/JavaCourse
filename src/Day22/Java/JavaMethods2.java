package Day22.Java;

public class JavaMethods2 {
    public static void main(String[] args) {
        JavaMethods2 jm = new JavaMethods2();
        String str = "Happy";
        jm.print(str);

        print2("My");
    }
    public void print(String s){
        s = s.concat(" World");
        System.out.println(s);
    }

    public static void print2(String s){
        s = s.concat(" World");
        System.out.println(s);
    }

}
