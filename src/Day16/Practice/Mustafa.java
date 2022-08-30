package Day16.Practice;

public class Mustafa {
    public static void main(String[] args) {
 /*
        return new string which is reversed of str
         */

        String str = "Mustafa";
        String rstr = " ";

        for (int i = str.length()-1; i >= 0; i-- ){
            System.out.println(rstr += str.charAt(i));
        }

        // return true, if number is palindromic, false if it is not

        /*Scanner scan = new Scanner(System.in);

        System.out.println("Enter a digit");
        int num = scan.nextInt();
        String str1 = String.valueOf(num);*/

        // Create a multiplication table only of number 2.
        // 1*2 = 2
        // 2*2 = 4
        // 3*2 = 6

        for(int i = 0; i<4;i++){
            System.out.println("2 x "+ i + "= " + 2 * i);
        }

        /*
        from 1 up to 10, print in one column all odd numbers, in the second column all even numbers.
        */

        for(int i = 0; i<=10; i++ ){
            if (i%2 == 0){
                System.out.print(i);
            }
        }
        System.out.println("");
        for(int i = 1; i<=10; i++ ){
            if (i%2 != 0){
                System.out.print(i);
            }
        }
        System.out.println("");
         /*
    return count of numbers divisible by 8 between 0 and 100
     */
        int count = 0;
        for (int i = 0; i < 100;i++){
            if (i%8==0){
                count++;
            }
        }
        System.out.println("count = " + count);

        /*
    String str = "Java is Fun";
    print all characters. if character is F, break the loop. don print F
     */

        String str2 = "Java is Fun";

        for(int i = 0 ;i < str2.length() -1;i++){
            if (str2.charAt(i)=='F'){
                break;
            }
            System.out.println(str2.charAt(i));
        }

        /*
    Hello World
    print each character, but 'l'
     */

        String hel = "Hello World";

        for(int i = 0 ;i < hel.length() ;i++){
            if (hel.charAt(i)=='l'){
                continue;
            }
            System.out.println(hel.charAt(i));
        }

         /*
    print all numbers from 0 to 50, except numbers divisible by 6
     */

        for(int i =0; i<50; i++){
            if (i%6 == 0){
                continue;
            }
            System.out.print(" "+ i);
        }


    }
}
