package Day15.Practice.GroupProjectWeek3;

import java.util.Random;

public class Task10 {
    /*
   Task: 10.
Generate two numbers.
number1 should be between 1 and 12, which represents a month
number2 should be between 1900 and 2022.
Create a date, in following format ==> November, 1980
     */
    public static void main(String[] args) {
        Random ram = new Random();
        int month = ram.nextInt(1,12);
        int year = ram.nextInt(1900,2022);
        System.out.println(month==1?"January, "+year: month==2?"February, "+year:
                 month==3?"March, "+year:
                 month==4?"April, "+year:
                 month==5?"May, "+year:
                 month==6?"June, "+year:
                 month==7?"July, "+year:
                 month==8?"August, "+year:
                 month==9?"September, "+year:
                 month==10?"October, "+year:
                 month==11?"November, "+year:"December, "+year);

//        int num1 = (int) (Math.random()*(12-1+1))+1;
//        int num2 = (int) (Math.random()*(2022-1900+1))+1900;
//        String result = "";
//        switch (num1){
//            case 1:
//                result = "January";
//                break;
//            case 2:
//                result = "February";
//                break;
//            case 3:
//                result = "March";
//                break;
//            case 4:
//                result = "April";
//                break;
//            case 5:
//                result = "May";
//                break;
//            case 6:
//                result = "June";
//                break;
//            case 7:
//                result = "July";
//                break;
//            case 8:
//                result = "August";
//                break;
//            case 9:
//                result = "September";
//                break;
//            case 10:
//                result = "October";
//                break;
//            case 11:
//                result = "November";
//                break;
//            case 12:
//                result = "December";
//                break;
//
//        }
//        System.out.println(result+ " , "+num2);
    }
}
