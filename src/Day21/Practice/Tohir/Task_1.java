package Day21.Practice.Tohir;

public class Task_1 {
    public static void main(String[] args) {

        String[] names = {"Michel", "John", "Jim"};
        String[] lastnames = {"Jordan","Travolta","Kerry"};
        String[][] str = new String[2][];
        str[0] = names;
        str[1] = lastnames;
        System.out.println(" " + str[0][0]+" " + str[1][0]);
        System.out.println(" " + str[0][1]+" " + str[1][1]);
        System.out.println(" " + str[0][2]+" " + str[1][2]);
        for (int i = 0; i < str[0].length; i++)
        {   for (int j=0; j < 1; j++) {
            System.out.println(str[j][i] + " " + str[j+1][i]);
        }
        }
    }
}
