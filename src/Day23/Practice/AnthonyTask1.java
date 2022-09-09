package Day23.Practice;

public class AnthonyTask1 {
       /*create a method
    which will take int[] and return the maxNum
    create a method, whihc will take int[] and return the minNum
    create, which will take two int parameters and calculate total of maxNum and minNum
     */

    public static void main(String[] args) {
        System.out.println("--------------------------------------TASK 1------------------------------------------");

        int[] a = {1,27,3,173};
        int Max = maxNum(a);
        int Min = minNum(a);
        int total = numTotal(Min, Max);
        System.out.println("total = " + total);


    }
    static int maxNum(int[]a){

        int max1=a[0];
        for(int j:a){
            if(j> max1){
                max1=j;
            }
        }
        return max1;

    }
    static int minNum(int[]a){
        int minNum = a[0];
        for (int j:a){
            if(j> minNum){
                minNum=j;
            }
        }
        return minNum;
    }
    static int numTotal(int a,int b){
        int numTot = a+b;
        return numTot;
    }

}
