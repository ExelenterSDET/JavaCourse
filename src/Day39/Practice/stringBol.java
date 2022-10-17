package Day39.Practice;

import java.util.ArrayList;

public class stringBol {
    public static void main(String[] args) {
        String str = "aabbbcccddeeeeeeedddaeeeaaaccc";

        ArrayList<String> arr=new ArrayList<>();
        int counter=0;
        String subStr="";
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i)!=str.charAt(i-1)) {
//                System.out.println("counter = " + (i-1));
                subStr = str.substring(counter, i);
                arr.add(subStr);
//                System.out.println("i = " + i);
                counter=i;
            }
        }
        subStr=str.substring(counter,str.length());
        arr.add(subStr);

        System.out.println("subStr = " + arr);

        int index=0;
        int elementlen=arr.get(0).length();
        for (int i = 1; i < arr.size(); i++) {
            if(arr.get(i).length()>elementlen){
                index=i;
                elementlen=arr.get(i).length();
            }
        }
        System.out.println(arr.get(index).charAt(0));
    }
}
