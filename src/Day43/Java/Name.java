package Day43.Java;

public class Name {
    public static void main(String[] args){

        String fullName = "";

        for(String arg: args){

            fullName += arg.substring(0,1).toUpperCase()
                    + arg.substring(1).toLowerCase() + " ";
        }

        System.out.println("Full name is " + fullName.trim());

    }
}
