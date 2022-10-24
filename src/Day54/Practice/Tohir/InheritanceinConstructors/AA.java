package Day54.InheritanceinConstructors;

public class AA {
    String name;
    public AA(String str){
        this.name = str;
        System.out.println("AA");
        System.out.println(getClass().getSimpleName()+ " : " + (this.name));
    }
}
class BB extends AA{
    public BB(String str) {
        super(str);
        System.out.println("BB");
        System.out.println(getClass().getSimpleName()+ " : " + (this.name));
    }
}
class CC extends BB{
    public CC(String str) {
        super(str);
        System.out.println("CC");
        System.out.println(getClass().getSimpleName()+ " : " + (this.name));
    }
}

class App2{
    public static void main(String[] args) {
        AA aa = new AA("test");
        System.out.println("======------======");
        BB bb = new BB("test2");
        System.out.println("======------======");
        CC cc = new CC("test3");
    }
}