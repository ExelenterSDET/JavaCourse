package Day24.Practice.Tohir_Week5;

public class Day24 {
    int getsum(int... nums)
    {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        return sum;
    }
    int length(int... nums){
        return nums.length;
    }
    double average(int... nums){
        return (double)getsum(nums)/length(nums);
    }
    public static void main(String[] args) {
        Day24 ab = new Day24();
        int [] num = {1,34,5,6,7};
        double a = ab.average(num);
        System.out.println("average = "+ a);
    }
}
