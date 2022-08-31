package Day16.Practice;

public class Dilnoza {

    public static void main(String[] args) {

       /* Task6.
                Using scanner create a string.
                Return reverse of a string.
                Example: str1 = Java, result should be = avaJ
                */
        System.out.println("                         ");
        System.out.println("===============TASK1================");
        String str = "Java";
        String newStr ="";
        for (int i = str.length()-1; i >=0 ; i--) {

            newStr+=str.charAt(i);
        }
        System.out.println(newStr);

        System.out.println("                         ");
        System.out.println("===============TASK2================");

        int number = 12365821;
        String num = String.valueOf(number);
        String numReverse = "";

        for (int i = num.length() - 1; i >= 0; i--) {
            numReverse += num.charAt(i);
        }
        System.out.println("Is Polendrome => " + num.equals( numReverse));

        System.out.println("                         ");
        System.out.println("===============TASK3================");
        int number11=2;

        for (int i = 1; i < 10; i++){
            int number2 = number11*i;
            System.out.println(number11+"*" +i +"=" + number2);
        }
        System.out.println("                         ");
        System.out.println("===============TASK4================");

        for (int i = 1;i <=10 ; i+=2) {
            int j = i+1;
            System.out.println(i + " "+ j );

        }
        System.out.println("                         ");
        System.out.println("===============TASK5================");
        int count = 0;

        for (int i = 8; i < 100; i+=8) {
            count ++;
            System.out.println("count = " + count);
        }
        System.out.println("                         ");
        System.out.println("===============TASK6================");
        String str1 = "Java is fun";
        char ch = 'f';
        for (int i = 0; i <str1.length() ; i++) {

            if (str1.charAt(i)=='f'){

                break;
            }  System.out.print(str1.charAt(i));
        }
        System.out.println("                         ");
        System.out.println("===============TASK7================");

        String str2 = "Hello World";
        for (int i = 0; i <str2.length() ; i++) {
            if(str2.charAt(i)=='l'){
                continue;
            }
            System.out.print(str2.charAt(i));
        }
        System.out.println("                         ");
        System.out.println("===============TASK8================");


        for (int i = 0; i < 50; i++) {
            if(i%6==0){
                continue;
            }
            System.out.println(i);

        }


    }

}
