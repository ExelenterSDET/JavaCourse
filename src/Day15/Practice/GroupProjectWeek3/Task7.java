package Day15.Practice.GroupProjectWeek3;

public class Task7 {
    /*
    Task7.
Create random string, which has a length of 30 and all characters are lower case letters.
return a count of the most repeated character.
Example: flapoeplksldfalafaaafoiwefafsa === output should be 8, since a is the most repeated.
 */
    public static void main(String[] args) {
       // String str = "flapoeplksldfalafaaafoiwefafsa";
        String str = "aaaannnnnmmmmmmkkkkkk";
        int index = 0;
        int count = 0;

        while(index<str.length()){
         // solution 1
           //  count += str.charAt(index) == 'a' ? 1 : 0;

        //    solution 2
            if(str.charAt(index) == 'a'){
                ++count;
            }
            index++;
        }
        System.out.println("count = " + count);

//     Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter a string = 30==>");
//        String str = scan.nextLine();
//        System.out.println(str.length()!=30?"length of string is not 30!!":
//                str.matches("[^A-Z!@#&()–[{}]:;',?/*~$^+=<>0-9]+$")?(str.length()-str.replace("a","").length()):"False");
//



    }


}
