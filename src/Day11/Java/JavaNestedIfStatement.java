package Day11.Java;

import java.util.Scanner;

public class JavaNestedIfStatement {
    /*
    The nested if statement represents
    the if block within another if
    block. Inner if block condition
    executes only when outer if block
    condition is true.
     */
    public static void main(String[] args) {

        /*
        boolean condition = true;
        if(condition){
            if(condition){

            }else if(condition){

            }else{

            }
        }else if(condition){
            if(condition){
                if(condition){

                }else{

                }
            }
        }

         */

        /*
        Given a String (grade)
        provide your grade for math(int)
        provide your second grade for science(int)

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grade");
        int gradeForMath = scan.nextInt();

        String grade = "";
        if(gradeForMath > 90){
            if(gradeForMath > 95){
                grade = "A+";
            }else{
                grade = "A-";
            }
        }else if (gradeForMath > 80){
            if(gradeForMath > 85){
                grade = "B+";
            }else{
                grade = "B-";
            }
        }else if (gradeForMath > 60){
            if(gradeForMath > 70){
                grade = "C+";
            }else{
                grade = "C-";
            }
        }else if (gradeForMath > 50){
            if(gradeForMath > 55){
                grade = "D+";
            }else{
                grade = "D-";
            }
        }else{
            grade = "F";
        }


        System.out.println(grade);




    }
}
