package Day27.Practice;

public class Arthur27Day {
    public static void main(String[] args) {
        String str = "123.12sd";
        String str1 = "123.12sdf";
        String[] str2 = {"A","aba", "aBA","ABA","Cat", "aba", "bad", "CAT", "CAt", "aba", "bad", "Bad", "cat", "aba", "ABA", "bAD", "bAd"};
        howRpt(str2);


        System.out.println("strDbl() = " + strDbl(str,str1));


//        methodvargs jr = new methodvargs();
//        jr.getTotal(1, src);




    }

//int getTotal(int number, int... numbers){
//int total=0;
//
//    for (int i = 0; i < numbers.length; i++) {
//
//        total += (total == numbers[i]) ? 1 :0;
//    }
//
//
//    return total;
//
//}


    static double stringToDbl(String a)
    {

        double b =  Double.parseDouble(a);
        return b;


    }

    static String rmChar(String str){

        return str.replaceAll("[^\\d.]","");
    }

    static boolean isMty(String str) {
        return str.isEmpty();
    }

    static double strDbl(String... arg){
        String mid;
        double total = 0;
        for (String str:arg) {
            total += (isMty(str)) ? -10 : stringToDbl(rmChar(str));
        }
        return total;
    }

    static boolean strEq(String s1, String s2){
        String ls1,ls2;
        ls1 = s1.toLowerCase();
        ls2 = s2.toLowerCase();
        return ls1.equals(ls2);
    }

    static int me(String str, String... arg){
        int total=0;
        for (String s: arg) {
            if (strEq(str,s)) {
                ++total;
            }
        }
        return total;
    }

    static void howRpt(String... arg){
        loop1: // a b b a a a b b b a a a b b
        for (int i = 0; i < arg.length; i++) {
            loop2:
            for (int j = 0; j < i; j++) {
                if (strEq(arg[i],arg[j])) {
                    continue loop1;
                }
            }
            System.out.println(arg[i].toLowerCase() +" " + me(arg[i],arg));

        }
    }



}
