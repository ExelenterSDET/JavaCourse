package Day24.Practice.Mustafa;

public class TaskN1 {
    // create a method which will take int varargs as parameter and return total
    // create a method which will take int varargs as parameter and return its length
    // create a method which will take int varargs as parameter, and return its average

    static int Total(int... num){
        int total = 0;
        for (int i = 0; i < num.length; i++) {
            total += num[i];

        }
        return total;
    }

    static int Length(int... num){ return num.length;}
    static int average(int...num){return Total(num)/Length(num);}

    public static void main(String[] args) {
        System.out.println(Total(new int[]{1,5,8,4,3,4,87,5}));
        System.out.println(Length(new int[]{1,5,8,4,3,4,87,5}));
        System.out.println(average(new int[]{1,5,8,4,3,4,87,5}));
    }
}
