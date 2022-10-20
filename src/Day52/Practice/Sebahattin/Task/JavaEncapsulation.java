package Day52.Practice.Sebahattin.Task;

public class JavaEncapsulation {
    public static void main(String[] args) {


    User user = new User();
    user.setUserName("Michel");
    user.setPassword("pass123");
    user.setBirthDay("05 10 2000");

    String userName = user.getUserName();
        System.out.println("userName = " + userName);
    String password = user.getPassword();
        System.out.println("password = " + password);
    String birthday = user.getBirthDay();
        System.out.println("birthday = " + birthday);
    int age = user.getAge();
        System.out.println("age = " + age);

        System.out.println("================================");
        User user2 = new User("Sebahattin","pass12345","02 05 1990");
        String userName1 = user2.getUserName();
        System.out.println("userName1 = " + userName1);;
        String password1 = user.getPassword();
        System.out.println("password = " + password1);
        String birthday1 = user.getBirthDay();
        System.out.println("birthday = " + birthday1);
        int age1 = user.getAge();
        System.out.println("age = " + age1);


    }
}
