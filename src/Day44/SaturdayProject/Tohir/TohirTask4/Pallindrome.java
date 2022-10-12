package Day44.SaturdayProject.Tohir.TohirTask4;

public class Pallindrome {

        public static void main(String[] args) {
            String temp  = "";
            String [] split = args[0].split("");
            for (int i = 0; i < split.length; i++) {
                temp = temp.concat(split[split.length-1-i]);
            }
            System.out.println(temp);
            if(temp.equals(args[0]))
            {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
    }

