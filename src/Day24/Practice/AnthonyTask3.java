package Day24.Practice;

public class AnthonyTask3 {

    // create a method which will take int varargs as parameter and return total
    int getTotal(int... nums){
        int total = 0;
        for (int num : nums) {
            total+=num;
        }
        return total;
    }
    // create a method which will take int varargs as parameter and return its length
    int getLength(int... nums){
        return nums.length;
    }

    // create a method which will take int varargs as parameter, and return its average
    double getAverage(int... nums){
        return (double)getTotal(nums)/getLength(nums);
    }

    public static void main(String[] args) {
        AnthonyTask3 t = new AnthonyTask3();

        System.out.println(t.getTotal(1,3,5,7,9,10,11,13));
        System.out.println(t.getLength(1,3,5,7,9,10,11,13));
        System.out.println(t.getAverage(1,3,5,7,9,10,11,13));
    }
}
