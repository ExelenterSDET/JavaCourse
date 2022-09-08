package Day22.Practice.Tohir;

public class JavaMethods_2 {
    public static void main(String[] args) {
        addWorld2("Hello");
        JavaMethods_2 addworld = new JavaMethods_2();
        addworld.addWorld("Hile");
    }
    public void addWorld(String S){ //Method
        S = S.concat(" World");
        System.out.println("" + S);
    }
    public static void addWorld2(String S){//Function
        S = S.concat(" World");
        System.out.println("" + S);
    }

}
