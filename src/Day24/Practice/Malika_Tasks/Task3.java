package Day24.Practice.Malika_Tasks;

public class Task3 {
//create a method which will take int varargs as parameter and return total

    int total (int... nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }
    //create a method which will take int varargs as parameter and return its length
    int length(int... nums){
        return nums.length;
    }
    //create a method which will take int varargs as parameter and return its average
    int average(int... nums){
        int total = 0;
        return total(nums)/length(nums);
    }

    public static void main(String[] args) {
        Task3 t = new Task3();
        System.out.println(t.total(1,3,5,7,9,10,11,13));
        System.out.println(t.length(1,3,5,7,9,10,11,13));
        System.out.println(t.average(1,3,5,7,9,10,11,13));

    }
}
