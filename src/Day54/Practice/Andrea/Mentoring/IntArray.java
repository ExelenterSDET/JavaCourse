package Day54.Practice.Andrea.Mentoring;

public class IntArray {
    // changes an int into an array of its digits
    public static void main(String[] args)
    {
        int num = 1234567;
        int[] digits = Integer.toString(num).chars().map(c -> c-'0').toArray();
        for(int d : digits)
            System.out.print(d);
    }
}
