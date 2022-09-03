package Day19.Practice;

public class arthur19day {

    public static void main(String[] args) {

        String strArr[] = {"$50", "$150", "$5", "$18", "$25"};
        int x = 0;
        int sumt = 0;

        for(String s: strArr){

            s=s.replace("$","");
            x =Integer.parseInt(s);
            sumt = sumt + x;

        }
        System.out.println(sumt / strArr.length);
        System.out.println(sumt);

    }
}
