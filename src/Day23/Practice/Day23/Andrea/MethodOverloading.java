package Day23.Practice.Day23.Andrea;

public class MethodOverloading {
    public static void main(String[] args) {

        String str = "Java";
        int num = 10;
        MethodOverloading mo = new MethodOverloading();
        System.out.println(mo.print(str));
        System.out.println(mo.print(num));


    }

    String print(String str){
        return str;
    }
    int print(int i, int y) {
        return i+y;
    }
    String print(int number) {
        return String.valueOf(number);
    }
}
