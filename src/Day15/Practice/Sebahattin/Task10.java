package Day15.Practice.Sebahattin;

public class Task10 {
    public static void main(String[] args) {
        /*      Generate two numbers.
        number1 should be between 1 and 12, which represents a month
        number2 should be between 1900 and 2022.
        Create a date, in following format ==> November, 1980
*/
        //Task10
        int num1 = (int) (Math.random()*(12-1+1))+1;
        int num2 = (int) (Math.random()*(2022-1900+1))+1900;
        String result = "";
        switch (num1){
            case 1:
                result = "January";
                break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "October";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "December";
                break;
        }
        System.out.println(result+ " , "+num2);
    }
}
