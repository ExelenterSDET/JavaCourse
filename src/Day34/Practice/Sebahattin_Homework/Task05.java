package Day34.Practice.Sebahattin_Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Task05 {
/*
        Given two ArrayList<String>
        the data of the lists are as below:
        {Andrea, Bahridin, Anthony, Arthur, Ufuk, Sebahattin, Dilnoza, Tohir, Besime, Day34.Practice.Malika, Mustafa, Ibrahim, Mehmet Ali}
        {(570) 899-6329, (885) 553-4829, (677) 374-5873, (513) 224-9164, (958) 338-2735, (398) 619-7665, (434) 494-4764, (229) 230-5207, (463) 612-2498, (388) 829-6837, (832) 305-6110, (445) 553-6905, (490) 849-4996}

        1. Create a method which will have parameter as two ArrayList<String>`s
           Add names and phone numbers to the map and return it.
           note: the phone number of a person has been stored under the same index where the persons name is.
           Example:
           Sebahattin is in the index 5. His phone number should be also in the index 5 ( (398) 619-7665 )

        2. Create a method which will have a parameter as a HashMap<String, String> and return type is a String.
           Using Scanner class, provide the name of a Student.
           The method should return the phone number of a Student.
           If Student doesn`t exist, return "Wrong number"
 */
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Andrea", "Bahridin", "Anthony", "Arthur", "Ufuk", "Sebahattin", "Dilnoza", "Tohir", "Besime", "Malika", "Mustafa", "Ibrahim", "Mehmet Ali"));
        ArrayList<String> phoneList = new ArrayList<>(Arrays.asList("(570) 899-6329", "(885) 553-4829", "(677) 374-5873", "(513) 224-9164", "(958) 338-2735", "(398) 619-7665", "(434) 494-4764", "(229) 230-5207", "(463) 612-2498", "(388) 829-6837", "(832) 305-6110", "(445) 553-6905", "(490) 849-4996"));

        System.out.println(getNameAndPhone(nameList, phoneList));
        System.out.println(getProvide(getNameAndPhone(nameList, phoneList)));
    }
    static HashMap<String, String> getNameAndPhone (ArrayList<String> nameList, ArrayList<String> phoneList){
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < nameList.size(); i++) {
            map.put(nameList.get(i), phoneList.get(i));
        }
            return map;
    }
    static String getProvide (HashMap<String, String> map){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter name = ");
        String student = input.nextLine();
        String backName = "Wrong number";
        for (HashMap.Entry<String,String> row : map.entrySet()){
            if (row.getKey().equals(student)){
                backName = row.getKey()+" : "+row.getValue();
            }
        }
        return  backName;
    }
}
