package Day16.Practice;

public class Malika {
    public static void main(String[] args) {
        //Task1
        /*Return new string which is reversed of str "Java"*/
        String str = "Java";
        String strReversed = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            strReversed += str.charAt(i);
        }
        System.out.println("TASK1 === >>> " + " strReversed = " + strReversed);

        //Task2
        /*return true, if number is palindromic, false if it is not*/

        String n = "12321";
        String nReversal = "";
        for (int i = n.length()-1; i >=0 ; i--) {
            nReversal += n.charAt(i);
        }
        System.out.println("TASK2 === >>> " + n.equals(nReversal));

        //Task3
        /*Create a multiplication table only of number 2.
        1*2=2
        2*2=4
        3*2=6 ... */
        System.out.println("TASK3: ");

        for (int i = 0, j = 2; i <= 10; i++) {
            System.out.println(i+"*"+j+"="+i*j);
        }

        //Task4
        /*from 1 up to 10, print in one column all odd numbers, in the second column all even numbers. */
        System.out.println("TASK4: ");

        for (int i1 = 1, j1 = 2; i1 <= 10; j1+=2, i1+=2) {
            System.out.println(i1+ " " +j1);
        }

        //Task5
        /*return count of numbers divisible by 8 between 0 and 100*/
        System.out.println("TASK5: ");

        int counter = 0;
        for (int i = 8; i < 100; i+=8) {
            counter++;
        }
        System.out.println("counter = " + counter);

        //Task6
        /*print all characters. if character is F, break the loop. don't print F */
        System.out.println("TASK6: ");

        String str1 = "Java is Fun";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) =='F'){
                break;
            }
            System.out.print(str1.charAt(i));
        }

        //Task7
        /* Print each character, but 'l' */
        System.out.println(" ");
        System.out.println("TASK7: ");

        String str2 = "Hello World";
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i)=='l'){
                continue;
            }
            System.out.print(str2.charAt(i));
        }

        //Task 8
        /* print all numbers from 0 to 50, except numbers divisible by 6 */
        System.out.println(" ");
        System.out.println("TASK8: ");

        for (int i = 0; i < 50; i++) {
            if (i%6 == 0){
                continue;
            }
            System.out.print(i + " ");

        }
    }
}
