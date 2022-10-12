package Day46.Mentoring;

/*               Given two arrays of ints, array1 and array2.
                 Print true if they have the same first element, or they have the same last element.
                 Otherwise, print false
                 Both arrays will be length 1 or more.

            [1, 2, 3], [7, 3] → true
            [1, 2, 3], [7, 3, 2] → false
            [1, 2, 3], [1, 3] → true
            [1, 2, 3], [1, 7, 5, 2] → true
           */


public class Task2 {
    static boolean getElements(int []arr1, int []arr2) {
        if (arr1[0]==arr2[0] || arr1[arr1.length-1] == arr2[arr2.length - 1]) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {7, 2, 3};
        boolean elements = getElements(arr1, arr2);
        System.out.println("elements = " + elements);
    }
}
