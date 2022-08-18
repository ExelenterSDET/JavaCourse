package Day7.Practice;

public class Dilnoza {
    public static void main(String[] args) {
//        Create 3 strings as "JAVA ", " IS ", "FUN".Using concat method assign to the new string all of them.Last string should be "JAVA IS FUN"
        String str1 = "JAVA";
        String str2 =" IS ";
        String str3 = "FUN";
        String str4 = str1.concat(str2).concat(str3);
        System.out.println("str4 = " + str4);
//        Task2: get the length of the last string
        System.out.println("Task2: "+"String length is: " + str4.length());
//        Task3: Get the index of the first "I" character
        System.out.println("Task3: "+"First char I: " + str4.indexOf( 'I'));
//        Task4: Get the character of the last index
        System.out.println("Task4: " +"Last index:" + str4.charAt(str4.length()-1));
//        Task5: Validate that the string has "JAVA"
        System.out.println("Task5: "+"Does it have Java: " + str4.contains("JAVA"));
//        Task6: Validate that the sting isEmpty
        System.out.println("Task6: "+ "Is StringEmpty: " +str4.isEmpty());

//        Task7: Substring "JAVA" from the string

        System.out.println("Task7: "+"Substring JAVA= "+ str4.substring(0,4));
//        {{Task8: create a new string which is "java". and using equals and equalsIgnoreCase methods validate that they are equal. }}
        String str5 = "java";

        System.out.println("Task8: "+ "isEqual: "+str1.equals(str5));
        System.out.println("Task8: "+ "isEqualIgnoreCase: "+str1.equalsIgnoreCase(str5));
    }
}
