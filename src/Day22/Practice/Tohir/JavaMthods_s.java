package Day22.Practice.Tohir;

public class JavaMthods_s {
    public static void main(String[] args) {
        JavaMthods_s add2nums = new JavaMthods_s();
        int num1 = 50;
        int num2 = 10;
        add2nums.add2Numbers(num1,num2);
        addnumber(num1,num2);
    }
    void add2Numbers(int a, int b){//method
        int sum = a+b;
        System.out.println("sum = " + sum);
    }
    static void addnumber(int a, int b){//function
        int sum = a+b;
        System.out.println("sum = " + sum);
    }
}
