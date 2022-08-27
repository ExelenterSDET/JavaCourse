package Day15.Java;

public class Task2WhileLoop {
    public static void main(String[] args) {
      /*
      return the total sum of all numbers until 10
       */

        int num = 1;
        int res = 0;
        while(num<=10){
            res+=num++;
        }
        System.out.println(res);

    }
}
