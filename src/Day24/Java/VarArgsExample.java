package Day24.Java;

public class VarArgsExample {

    public static void main(String[] args) {
        int price1 = 10;
        int price2 = 15;
        int price3 = 20;
        int price4 = 30;
        int price5 = 50;
        System.out.println(getTotal(price1, price2));
        System.out.println(getTotal(price1, price2, price3, price4, price5));
    }

    public static int getTotal(int... args){
        int total = 0;
        for (int i = 0; i < args.length; i++) {
            total += args[i];
        }
        return total;
    }

//    public static int getTotal(int a , int b){
//        return a+b;
//    }
//
//    public static int getTotal(int a , int b, int c){
//        return a+b+c;
//    }

}
