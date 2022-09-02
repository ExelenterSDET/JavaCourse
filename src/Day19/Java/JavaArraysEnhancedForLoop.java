package Day19.Java;

public class JavaArraysEnhancedForLoop {

    public static void main(String[] args) {

        String [] strArr = {"Andrea", "Anthony", "Arthur", "Bakhriddin", "Mustafa"};

        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);
        System.out.println(strArr[4]);


        for (String eachElement : strArr) {     // Automatically creating eachElement String variable
                                                // and assigning each element of the Array.
            System.out.println(eachElement);
        }

    }
}
