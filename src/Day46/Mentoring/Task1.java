package Day46.Mentoring;

//  Given an integer, write a function to determine if it a power of 2.
public class Task1 {
    static boolean powerOF2(int x){

        int i = 1;
        while (i < x){
            i *= 2;
        }
        if(i == x){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean b = powerOF2(33);
        System.out.println(b);
    }
}
