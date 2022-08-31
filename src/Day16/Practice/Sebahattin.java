package Day16.Practice;

public class Sebahattin {
    public static void main(String[] args) {
        System.out.println("Task1");
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
            if (i==3){
                break;
            }
        }
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Task2");
        String str = "Java is Fun";
        for (int i =0; i <str.length(); i++){
            if (str.charAt(i) == ' '){
                continue;
            }
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Task3");
        int a = 2;
        for (int i = 1; i <= 10; i++) {
            int b = i * a;
            System.out.println(i+"*"+a+"="+b);
        }
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Task4");
        for (int i = 0 , j = 1 ; i <= 10; i+=2, j+=2) {

            System.out.println(i + "  "+ j);
        }
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Task5");
        int num = 100;
        int count = 0;
        for (int i = 1; i < num ; i++) {
            if (i%8==0){
                count ++;
            }
        }
        System.out.println("Number =" +num);
        System.out.println(count);

        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Task6");
        String str1 = "Java is Fun";
        char ch = 'F';
        for (int i = 0; i < str.length(); i++) {

            if (str1.charAt(i) == ch) {
                break;
            } else {
                System.out.print(str1.charAt(i));
            }
        }
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Task7");
        String str2 = "Hello World";
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) =='l'){
                continue;
            }
            System.out.print(str2.charAt(i));
        }
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Task8");
        for (int i = 1; i < 50; i++) {
            if (i%6 == 0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
