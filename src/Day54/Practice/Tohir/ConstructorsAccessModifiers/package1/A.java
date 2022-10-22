package Day54.ConstructorsAccessModifiers.package1;

public class A {
    String name;
    int number;
    private A(){}

    A(String name) {
        this.name = name;
    }


    protected A(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public A(int number){
        this.number = number;
    }
}
