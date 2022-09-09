package Day23.Java;

public class JavaMethodOverloading {

    // Interview question: What is Method Overloading?

    public static void main(String[] args) {

        String str = "Java";
        int num = 10;


        JavaMethodOverloading jm = new JavaMethodOverloading();


        System.out.println(jm.print(str));
        System.out.println(jm.print(num));


    }

    String print(String str){
        return str;
    }

    int print(int i, int y){
       return i+y;
    }

    String print(int number){
        return String.valueOf(number);
    }

    String print(String s, int n){
        return s+n;
    }

    String print(int n, String s){
        return s+n;
    }
}
