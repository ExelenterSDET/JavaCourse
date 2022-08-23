package Day11.Java;

public class PracticeOCA3 {
    public static void main(String[] args) {


        String str1 = "Java";
        String str2 = new String("java");
        //  line n1
        if(str2.equals(str1.toLowerCase()))
        {
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }


    }
}
/*
Which code fragment, when inserted at line n1, enables the App class to print Equal?

    A
        str1.toLowerCase();
        if(str1 == str2)
    B
        if(str2.equals(str1.toLowerCase()))
    C
        str1.toLowerCase();
        if(str1.equals(str2.toLowerCase()))
    D
        if(str1.toLowerCase() == str2.toLowerCase())

A.	Option A
B.	Option B
C.	Option C
D.	Option D

 */
