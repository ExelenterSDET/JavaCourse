package Day27.Practice;

public class Tohir {

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
