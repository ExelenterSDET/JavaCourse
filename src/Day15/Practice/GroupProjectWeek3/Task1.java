package Day15.Practice.GroupProjectWeek3;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
     /*   Task1:  //Task1:
        //Generate two numbers btw 0 and 10.
        //if both numbers have same remainder when divided by 3, return which ever is smaller.
        //if both numbers dont have same remainder when divided by 3, return whichever is larger.
        //if both numbers are equal, return sum of numbers;*/
        Random random = new Random();

        int db1=random.nextInt(10);
        System.out.println("DB1= " + db1);
        int db2=random.nextInt(10);
        System.out.println("DB2= " +db2);
        if (db1%3==db2%3) {
            System.out.println("remainders are equal");

            if(db1<db2){
                 System.out.println("DB1 is smallest number="+db1);
            }else {
                System.out.println("DB2 is smaller = "+ db2);
            }

        } else if (db1%3!=db2%3) {
            if(db1%3<db2%3)
            System.out.println("DB2 is a largest number="+db2);
            else{
                System.out.printf("DB1 is a largest number= " +db1);
            }

        } else if (db1%3==db2%3) {
            System.out.println("Both numbers are equal and sum is "+(db1+db2));

        }else{
            System.out.println("Sorry: Invalid input");
        }
    }
}
