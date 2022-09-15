package Day27.Java;

public class JavaVarArgs3 {
    public static void main(String[] args) {

        int[] arr = {1,3,5,7,1,5,7,1,1,1,2,6,5,4};
        int number = 1;

        JavaVarArgs3 jv = new JavaVarArgs3();
        int countNumber = jv.countValues(number, 1, 3, 5, 7, 1, 5, 7, 1, 1, 1, 2, 6, 5, 4);
        System.out.println("countNumber = " + countNumber);

        int countNumber2 = jv.countValues(number, arr);
        System.out.println("countNumber2 = " + countNumber2);
    }

    int countValues(int number, int... args){
        int count = 0;
        for (int arg : args) {
            count += (arg == number) ? 1 : 0;
        }
        return count;
    }

}
