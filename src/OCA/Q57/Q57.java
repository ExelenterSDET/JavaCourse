package OCA.Q57;

public class Q57 {
    public static void main(String[] args) {
        System.out.println("Hello " + new StringBuilder("Java SE 8"));
        System.out.println("Hello " + new MyString("Java SE 8"));
    }
}

class MyString{
    String str;

    public MyString(String str) {
        this.str = str;
    }

//    @Override
//    public String toString() {
//        return  str;
//    }
}
