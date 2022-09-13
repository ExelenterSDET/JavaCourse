package Day24.Practice.Day24Andrea;

public class Task3 {


     int getTotal(int... nums) {
         int total = 0;

         for (int num : nums) {
             total += num;
         }
         return total;

     }

     int getLength(int... nums) {
        int length = 0;
        return nums.length;
    }

    double getAvg(int... nums) {
         return (double)getTotal(nums)/getLength(nums);
    }

    public static void main(String[] args) {
        Task3 t = new Task3();

        int[] nums = {3,5,6,3,5,7,4,6,3,53};

        System.out.println("getTotal = " + t.getTotal(nums));
        System.out.println("getLength = " + t.getLength(nums));
        System.out.println("getAverage = " + t.getAvg(nums));

    }

}
