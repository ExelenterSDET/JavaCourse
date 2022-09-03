package Day15.Practice;

import java.util.Scanner;

public class AnthonyTASKS {

    public static void main(String[] args) {

        String str1 = "Java is Fun";
        int index1 = 0;
        while (index1 < str1.length()) {
            System.out.print(str1.charAt(index1++));


            System.out.println("\n"+"------------------------------------------------------------------");

            int num = 1;
            int res = 0;
            while(num<=10){
                res+=num++;
            }
            System.out.println(res);

            System.out.println("\n"+"------------------------------------------------------------------");


            String str = "Just because the water is red doesn't mean you can't drink it.";
            int index = 0;
            int count = 0;


            while(index<str.length()){
                // solution 1
                //count += str.charAt(index) == 'a' ? 1 : 0;

                //solution 2
                if(str.charAt(index) == 'a'){
                    ++count;
                }
                index++;
            }
            System.out.println("count = " + count);


            System.out.println("\n"+"------------------------------------------------------------------");

            String str4 = "Java is Fun";
            int index4 = 0;
            do{
                System.out.print(str4.charAt(index4++));
            }while(index<str4.length());


            System.out.println("\n"+"------------------------------------------------------------------");

            Scanner scan = new Scanner(System.in);

            System.out.println("Give First number => ");
            int i = scan.nextInt();
            System.out.println("Enter Power => ");
            int i1 = scan.nextInt();

            int num1 =1;
            do {num1 = num1*i1;
                i1--;

            } while (i1 >0);
            System.out.println("TASK 5= " +num1);


        }
    }
}
