package Day43.Practice.Anthony.PracticeTasks;

public class NameBahodurStyle {
    public static void main(String[] args) {
        for (String eachName:args) {
            System.out.println(eachName.substring(0, 1).toUpperCase().concat(eachName.substring(1)));
        }
    }
}
