package Day54.Java.InheritanceInConstructors;

public class AA {
    String name;

    public AA(String str){
        this.name = str;
        System.out.println("AA");
        System.out.println(getClass().getSimpleName() + " : " + this.name);
    }
}
class BB extends AA{
    public BB(String str) {
        super(str);
        System.out.println("BB");
        System.out.println(getClass().getSimpleName() + " : " + this.name);
    }
}

class CC extends BB{
    public CC(String str) {
        super(str);
        System.out.println("CC");
        System.out.println(getClass().getSimpleName() + " : " + this.name);
    }
}

class App2{
    public static void main(String[] args) {
        AA a = new AA("TEST");
        System.out.println("=================");
        BB b = new BB("TEST2");
        System.out.println("=================");
        CC c = new CC("TEST3");

    }
}
