package Day39.Practice.Dilnoza.Task2;

public class School {
    public static void main(String[] args) {
        Student student = new Student("David",12345);
        Student student2 = new Student("Sam",54321);

        Lesson math= new Lesson("Math",3,85);
        Lesson history= new Lesson("History",2,95);
        Lesson english= new Lesson("English",3,92);
        Lesson dance= new Lesson("Dance",1,85);
        System.out.println("student2 = " + student2);
        Lesson physics= new Lesson("Physics",9,75);
        System.out.println("math = " + math);
        System.out.println("history = " + history);
        System.out.println("english = " + english);
        System.out.println("dance = " + dance);
        System.out.println("physics = " + physics);







    }
}
