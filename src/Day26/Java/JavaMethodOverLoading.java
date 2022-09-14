package Day26.Java;

public class JavaMethodOverLoading {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 10;
        System.out.println(getTotal(a,b));

        long a1 = 2;
        long a2 = 4;
        System.out.println(getTotal(a1,a2));

        String str1 = "10";
        String str2 = "20";
        System.out.println(getTotal(str1,str2));

        long total = getTotal(a, b, c);
    }

    static int getTotal(int a, int b){
        return a+b;
    }

    static long getTotal(long a, long b){
        return a+b;
    }

    static long getTotal(int a, int b, int c){
        return a+b+c;
    }

    static int getTotal(String a, String b){
        return (Integer.parseInt(a)+Integer.parseInt(b));
    }
}
