package Day15.Java;

public class JavaWhileLoop {

    /*
    while loop is used to iterate a
    part of the program several times.
     */

    public static void main(String[] args) {

        int num=0;

        while(num < 10){
            System.out.print("HELLO ");
            System.out.print("WORLD");
            System.out.print("!!!!!!! ");
            num ++;
            System.out.println(num);
        }


        String str = "Hello world";
        int index = 0;

        while(str.charAt(index) != 'w'){
            System.out.println(str.charAt(index));
            index++;
        }

        String str2 = "Hello world Hello world Hello world Hello world Hello world Hello world ";
        boolean condition = true;
        int ind = 0;

        while(condition){
            System.out.print(str2.charAt(ind));

            if(++ind == 20){
                condition = false;
            }
        }





    }
}
