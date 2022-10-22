package Day53.Practice.mentoring_10_21;

public class intSteam {
    public static void main(String[] args) {
        int num  = 123;
        int[] arr = Integer.toString(num).chars().map(eachNumber -> eachNumber - '0').toArray();


              /*String str = String.valueOf(num);
        String[] strArr = str.split(""); // [1, 2, 3];
        int[] arr = new int[strArr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        System.out.println(Arrays.toString(arr));*/

    }
}
