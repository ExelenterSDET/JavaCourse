package Day15.Java;

public class Task3WhileLoop {

    /*
    String str = "Just because the water is red doesn't mean you can't drink it."
    count of many letter 'a' you have in this sentence.
     */

    public static void main(String[] args) {
        String str = "Just because the water is red doesn't mean you can't drink it.";
        int index = 0;
        int count = 0;


        while(index<str.length()){
            // solution 1
            //count += str.charAt(index) == 'a' ? 1 : 0;

            //solution 2
            if(str.charAt(index) == 'a'){
                ++count;
            }
            index++;
        }
        System.out.println("count = " + count);
    }

}
