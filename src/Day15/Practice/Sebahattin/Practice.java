package Day15.Practice.Sebahattin;

public class Practice {
    public static void main(String[] args) {
        String str = "Java is Fun";
        int num =0;
        do {
            char ch = str.charAt(num);
            System.out.println(ch);
            num ++;

        }while (num<str.length());
        System.out.println("-----------------");

        int num1 = 0;
        while (num1 < 10){
            System.out.print("HELLO ");
            System.out.print("WORLD");
            System.out.print("!!!!!!!! ");
            num1 ++;
            System.out.println(num1);
        }
        String str1 = "Hello world";
        int index = 0;

        while (str1.charAt(index) != 'w'){
            System.out.println(str1.charAt(index));
            index++;
        }
        System.out.println("-------------------");

        num = 100;
        int sum=0;
        while (num > 0){
            sum = num + sum;
            num--;
        }
        System.out.println(sum);
    }
}
