package Day39.Practice.SaturdayProject8Andrea.Task4;

public class Task4 {
    // ***********not finished************
//    Given an array of Strings.
//    Create a method, that will sort this array of Strings in ascending order.
//
//    !!!!!!!! NOTE: Do not use any of built-in sort methods => (Arrays.sort, Collection.sort etc.) !!!!!!!!!
    public static void main(String[] args) {
        Task4 t4 = new Task4();
        String[] array = new String[] {"apple", "dog", "cat", "peach", "ant","rug", "zero"};
        System.out.println(t4.sortAscending(array));
    }

    public String[] sortAscending (String[] arr){
        String[] array = new String[arr.length];

        int index = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length; j++) {
                String temp = "";
                if (array[i].charAt(index) > array[j].charAt(index)) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                else if (array[i].charAt(0) == array[j].charAt(0)){


                }
            }

        }
        return array;
}
//        public int compareStrings (String word1, String word2){
//
//        }






}
