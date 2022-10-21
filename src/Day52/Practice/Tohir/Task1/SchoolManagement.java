package Day52.Tohir.Task1;

import java.util.ArrayList;
import java.util.List;

public class SchoolManagement {
    public static void main(String[] args) {
        List<Day52.Tohir.Task1.Student> list = new ArrayList<>();
        Day52.Tohir.Task1.Student student1 = new Day52.Tohir.Task1.Student("Mike","Shaun");

        Day52.Tohir.Task1.School school = new Day52.Tohir.Task1.School("HKL",4,06060505,"hkl@edu.tj",
                "May21", list);
        school.setListofStudent(student1);
        System.out.println(school);

        /*school.setListofStudent(student5);
        System.out.println(school);*/

    }
}
