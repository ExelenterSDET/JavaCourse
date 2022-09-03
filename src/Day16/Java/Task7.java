package Day16.Java;

public class Task7 {

    /*
    Hello World
    print each character, but 'l'
     */

    public static void main(String[] args) {

        String str = "Hello World";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'l'){
                continue;
            }
            System.out.print(str.charAt(i));

        }
        System.out.println();
        System.out.println("========================");

        int index = 0;
        while(index<str.length()){
            if(str.charAt(index) == 'l'){
                index++;
                continue;
            }
            System.out.print(str.charAt(index));
            index++;
        }


    }
}
