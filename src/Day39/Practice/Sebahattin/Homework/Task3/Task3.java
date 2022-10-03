package Day39.Practice.Sebahattin.Homework.Task3;

public class Task3 {
    public static void main(String[] args) {
        String str = "aaaabbacccccddzzzzzzzzzllldcccaaaddddaacmmmmmm";
        System.out.println(getConsecutivelyRepeated(str));
    }
    static char getConsecutivelyRepeated(String str){
        char chr = str.charAt(0);
        int total = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                    count++;
                }
            else {
                if ( count > total){
                    chr = str.charAt(i);
                    total = count;
                }
                count =0;
            }
        }
        return chr;
    }
}
