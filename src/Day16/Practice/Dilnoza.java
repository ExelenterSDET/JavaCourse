package Day16.Practice;

public class Dilnoza {

    public static void main(String[] args) {

       /* Task6.
                Using scanner create a string.
                Return reverse of a string.
                Example: str = Java, result should be = avaJ
                */
        System.out.println("===============TASK1================");
        String str = "Java";
        String newStr ="";
        for (int i = str.length()-1; i >=0 ; i--) {

            newStr+=str.charAt(i);
        }
        System.out.println(newStr);

        System.out.println("===============TASK2================");



        System.out.println("===============TASK2================");
        int number=2;

        for (int i = 1; i < 10; i++){
            int number2 = number*i;
            System.out.println(number+"*" +i +"=" + number2);
        }

        System.out.println("===============TASK5================");
        int count = 0;

        for (int i = 8; i < 100; i+=8) {
            count ++;
            System.out.println("count = " + count);
        }




        
    }

}
