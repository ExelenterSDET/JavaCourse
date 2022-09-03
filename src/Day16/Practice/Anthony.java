package Day16.Practice;

public class Anthony {

    public static void main(String[] args) {
        /*
        return in reverse

         */
        String str = "Java";
        String newStr="";

        for (int i = str.length()- 1; i >= 0; i--) {

            //prints every letter going back words
            newStr+=str.charAt(i);
        }
        System.out.println("TASK 1 = " + newStr);

        System.out.println("---------------------------------------------------------------------------");

        String n = "1234321";
        //return true, if number is palindromic, false if it is not
        /*
        return in reverse

         */
        String nReversal="";

        for (int i = n.length()- 1; i >=0 ; i--) {

            //prints every letter going back words
            nReversal+=n.charAt(i);
        }
        System.out.println("TASK 2 = " +(n.equals(nReversal)));

        System.out.println("---------------------------------------------------------------------------");

        //create a multiplication table only for number 2

        // 2x1 = 2 etc...

        int index = 1;

        while (index < 10) {

            index++;
        }
        int num=2;

        for (int i = 1; i <= 10; i++ ) {
            int newNum =i *num;
            System.out.println("TASK 3 = " + (num+"*"+i+"="+newNum));
        }

        System.out.println("---------------------------------------------------------------------------");

        //from 1 up to 10 , print in one column all odd numbers, in the second column all even numbers.

        for (int i = 1, j= 2; i <=10 ; i+=2, j+=2){
            System.out.println("TASK 4 = " + (i+ " " + j));

        }

        System.out.println("---------------------------------------------------------------------------");


        /*
        given number =100;
        return count of numbers divisible by 8 between 0 and given number
         */
        int howMany =0;
        for (int i = 1; i <= 100; i++) {
            if(i%8==0)
                howMany++;


        }
        System.out.print("TASK 5 = " + (howMany));

        System.out.println("\n"+ "---------------------------------------------------------------------------");

        String str6 = "Java is Fun";

        for(int i=0;i<str6.length()-1;i++){
            if(str6.charAt(i) == 'F'){
                break;
            }
            System.out.println("TASK 6 = " + (str6.charAt(i)));
        }
        System.out.println("---------------------------------------------------------------------------");

        System.out.print("TASK 7 ");

        //Hello World
        //print each character, but 'l'

        String str7 = "Hello World";

        for (int i = 0; i < str7.length(); i++) {
            if (str7.charAt(i) == 'l') {
                continue;

            }

            System.out.print(str7.charAt(i));
        }


        System.out.println("\n"+"---------------------------------------------------------------------------");

        //print all number from 0 to 50 , except number division by 6
        System.out.print("TASK 8 ");

        for (int i = 0; i <=50 ; i++) {
            if(i%6 == 0){
                continue;
            }

            System.out.print(i +" ");
        }





    }
}
