package Day43.Practice.Anthony.PracticeTasks;

public class NameInstructor {
    public static void main(String[] args) {
        System.out.println("Full name is ");
        System.out.println(args[0].substring(0,1).toUpperCase()+
                args[0].substring(1).toLowerCase());

        System.out.println(" " + args[1].substring(0,1).toUpperCase()+
                args[1].substring(1).toLowerCase());
    }
}
