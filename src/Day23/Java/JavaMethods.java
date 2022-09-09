package Day23.Java;

import java.util.Arrays;

public class JavaMethods {
    public static void main(String[] args) {

       int total =  total(2,3);
        System.out.println(total + 10);

       String name = getFullName("Furkat ", "Ali");
        System.out.println(name);

        JavaMethods jm = new JavaMethods();
        int [] arr = jm.getArr(1,2);
        System.out.println(Arrays.toString(arr));

        String[] arr2 = jm.getArr2("ab", "cd");
        System.out.println(Arrays.toString(arr2));

        String[][] arr3 = jm.getArr3("xy", "z");
        System.out.println(Arrays.deepToString(arr3));


    }

    public static int total(int a, int b){
        int total = a+b;
        return total;
    }

    static String getFullName(String firstName, String lastName ){
        return firstName.concat(lastName);
    }

    public int[] getArr(int a, int b){
      int[] arr = new int[2];
      arr[0] = a;
      arr[1] = b;
      return arr;
    }

    public String[] getArr2(String a, String b){
        return new String[] {a, b};
    }

    public String[][] getArr3(String a, String b){
        return new String[][] {{a}, {b}};
    }
}
