package Day19.Practice.Mentoring_09_02_2022;

public class Task4 {

    public static void main(String[] args) {
        /*Task4
         * Given an array of integers {6, 9, 1, 0, 8};
         * return true if 6 appears as either the first or last element in the array.
         * */

        int [] iArr = {7, 9, 1, 0, 6};
        int n = 6;
        boolean hasNum = iArr [0] == n || iArr[iArr.length-1] == n ? true : false;

        System.out.println(hasNum);



    }
}
