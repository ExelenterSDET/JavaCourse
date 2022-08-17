package Day7.Practice;

public class Andrea {
    public static void main(String[] args) {
        String stringA = "JAVA ";
        String stringB = "IS ";
        String stringC = "FUN";
        String sentence = stringA.concat(stringB.concat(stringC));

        System.out.println("sentence = " + sentence);
        System.out.println("length: " + sentence.length());
        System.out.println("Index of I: " + sentence.indexOf("I"));
        System.out.println("Last Character: " + sentence.charAt(sentence.length()-1));

        boolean hasJava = sentence.contains("JAVA ");
        System.out.println("Contains JAVA: " + hasJava);

        boolean isEmpty = sentence.isEmpty();
        System.out.println("Is empty: " + isEmpty);

        String myJava3 = sentence.substring(0,4);
        System.out.println("Sub string: " + myJava3);

        String myJava4 = "java";
        Boolean isEqual = myJava3.equals(myJava4);
        System.out.println("Is equal: " + isEqual);

        Boolean isEqualIgnoreCase = myJava3.equalsIgnoreCase(myJava4);
        System.out.println("Is equal ignore case: " + isEqualIgnoreCase);

    }
}
