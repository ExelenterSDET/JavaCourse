package Day23.Practice.Dilnoza;

public class Task2 {
    /*
    create a method with return type boolean.
    Takes 1 String parameter
    Validate if given String has at least 8 chars.
     */

        public static void main(String[] args) {

            Task2 trueOrFalse = new Task2();
            boolean isTrueOrFalse = trueOrFalse.validateLength("hello");
            System.out.println("isTrueOrFalse = " + isTrueOrFalse);
        }
        boolean validateLength(String str){
            boolean validation = false;
            if(str.length()>=8){
                validation=true;
            }
            return validation;
        }
    }

