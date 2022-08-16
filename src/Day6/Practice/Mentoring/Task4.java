package Day6.Practice.Mentoring;

public class Task4 {

    public static void main(String[] args) {
        // TASK4: Create following variables:
//        byte b = 5;
//        short s = 8;
//        int i = 10;
//        long l = 11;
//        float f = 12.13f;
//        double d = 15.0;

//   create new variable as follows:
//   int i1 = 0;
//   reassign all variables to it.
//   identify type of casting for each variable reassignment
//   Sample output: upcasting ===> 8


        byte b = 5;
        short s = 8;
        int i = 10;
        long l = 11;
        float f = 12.13f;
        double d = 15.0;

        int i1 = 0;

        i1 = b; // upcasting
        System.out.println("upcasting ====>" + i1);
        i1 = s;
        System.out.println("upcasting ====>" + i1);
        i1 = i;
        System.out.println("reassignment=>" + i1);
        i1 = (int) l;
        System.out.println("downcasting====>" + i1);
        i1 = (byte) f;
        System.out.println("downcasting====>" + i1);
        i1 = (short) d;
        System.out.println("downcasting====>" + i1);


    }
}
