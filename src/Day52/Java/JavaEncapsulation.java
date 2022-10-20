package Day52.Java;

public class JavaEncapsulation {
    /*
    To achieve encapsulation in Java
        ● Declare the variables of a class as private.
        ● Provide public setter and getter methods to modify and view the variables values.

    Advantages of Encapsulation:
        ● Data Hiding: The user will have no idea about the inner implementation of the class. It will not be visible to the
        user that how the class is storing values in the variables. He only knows that we are passing the values to a
        setter method and variables are getting initialized with that value.
        ● Increased Flexibility: We can make the variables of the class as read-only or write-only depending on our
        requirement. If we wish to make the variables as read-only then we have to omit the setter methods like
        setName(), setAge() etc. from the above program or if we wish to make the variables as write-only then we have
        to omit the get methods like getName(), getAge() etc. from the above program
        ● Reusability: Encapsulation also improves the re-usability and easy to change with new requirements.
        ● Testing code is easy: Encapsulated code is easy to test for unit testing.
     */
    public static void main(String[] args) {

        User user = new User();
        user.setUserName("Michael");
        user.setPassword("pass12345");
        user.setBirthDay("05 10 2000");
        System.out.println("user = " + user);

        int id1 = user.getId();
        System.out.println("id1 = " + id1);
        String userName = user.getUserName();
        System.out.println("userName = " + userName);
        String password = user.getPassword();
        System.out.println("password = " + password);
        String birthDay = user.getBirthDay();
        System.out.println("birthDay = " + birthDay);
        int age = user.getAge();
        System.out.println("age = " + age);

        System.out.println("=================================");
        User user2 = new User("John Wick", "password123456576", "10 10 1999");
        int id = user2.getId();
        System.out.println("id = " + id);
        String userName1 = user2.getUserName();
        System.out.println("userName1 = " + userName1);
        String password1 = user2.getPassword();
        System.out.println("password1 = " + password1);
        String birthDay1 = user2.getBirthDay();
        System.out.println("birthDay1 = " + birthDay1);
        int age1 = user2.getAge();
        System.out.println("age1 = " + age1);


    }
}
