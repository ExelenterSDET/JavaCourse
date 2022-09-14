package Day26.Java;

public class JavaMethodOverLoading2 {
    public static void main(String[] args) {

        String s = "50";
        int i = 100;
        int total = getTotal(s, i);
        int total1 = getTotal(i, s);
        System.out.println("total1 = " + total1);
        System.out.println("total = " + total);
    }


    static int getTotal(String a, int i){
        return (Integer.parseInt(a)+i);
    }

    static int getTotal(int i, String a){
        return (Integer.parseInt(a)+i);
    }
}
