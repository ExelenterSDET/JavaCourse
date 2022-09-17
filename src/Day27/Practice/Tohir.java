package Day27.Practice;

public class Tohir {
    public static void main(String[] args) {
        Tohir tju = new Tohir();
        tju.Returnoftotalnumberofstrings("nam","man","man","nam","man");
    }

    static boolean stringsAreEqual(String s1, String s2){
        return s1.toLowerCase().equals(s2.toLowerCase());
    }
    void Returnoftotalnumberofstrings(String... str)
    {

        String values = "";
        for (int i = 0; i < str.length; i++) {
            int sum = 0;
            if (values.contains(str[i].toLowerCase()) == false) {
                for (int j = 0; j < str.length; j++) {
                    if (stringsAreEqual(str[i].toLowerCase(), str[j].toLowerCase())) {
                        sum++;
                    }
                }
                values = values.concat("\n"+str[i].toLowerCase()).concat("="+String.valueOf(sum));
            }
        }
        System.out.println(values);
    }
}
