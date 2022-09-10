package Day23.Practice.Dilnoza;

public class Task1 {
    /*
    Create a method, which take int [] and return maxNumber
    Create a method, which take int [] and return minNumber
    Create a method, which take  2 int parameter that will get a total of min and max
     */

        public static void main(String[] args) {
            Task1 maxMin =new Task1();
            int[] array = {10, 15, 8, 55, 12, 102, 99, 2, 15};
            int max = maxNumber(array);
            System.out.println("max = " +max);
            int min=  minNumber(array);
            System.out.println("min = " + min);

            System.out.println("total = "+maxMin.total(max,min));

        }

        static int maxNumber(int [] max){
            int maxValue = max[0];
            for (int i = 0; i <max.length ; i++) {
                if (maxValue<max[i]){
                    maxValue=max[i];

                }

            }
            return maxValue;
        }

        static int minNumber ( int []min){
            int minValue = min[0];
            for (int i = 0; i < min.length; i++) {
                if(minValue>min[i]){
                    minValue=min[i];
                }

            }return minValue;
        }

        int total (int min, int max ){
            int sum = min+max;
            return sum;
        }

}
