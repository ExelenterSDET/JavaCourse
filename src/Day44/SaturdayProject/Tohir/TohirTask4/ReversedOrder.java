package Day44.SaturdayProject.Tohir.TohirTask4;

public class ReversedOrder {
    public static void main (String[] args)
    {
        String [] temp  = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            temp[args.length-1-i] = args[i];
        }
        for (String s : temp) {
            System.out.print(s+" ");

        }
    }
}
