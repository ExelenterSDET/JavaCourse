package Day34.Practice.SaturdayProject7Andrea;

import java.util.*;

public class Task5 {

    //    Task 5
//
//    Given two ArrayList<String>
//    the data of the lists are as below:
//    {Andrea, Bahridin, Anthony, Arthur, Ufuk, Sebahattin, Dilnoza, Tohir, Besime, Day34.Practice.Malika, Mustafa, Ibrahim, Mehmet Ali}
//    {(570) 899-6329, (885) 553-4829, (677) 374-5873, (513) 224-9164, (958) 338-2735, (398) 619-7665, (434) 494-4764, (229) 230-5207, (463) 612-2498, (388) 829-6837, (832) 305-6110, (445) 553-6905, (490) 849-4996}
//
//        1. Create a method which will have parameter as two ArrayList<String>`s
//    Add names and phone numbers to the map and return it.
//            note: the phone number of a person has been stored under the same index where the persons name is.
//    Example:
//    Sebahattin is in the index 5. His phone number should be also in the index 5 ( (398) 619-7665 )
//
//            2. Create a method which will have a parameter as a HashMap<String, String> and return type is a String.
//    Using Scanner class, provide the name of a Student.
//    The method should return the phone number of a Student.
//    If Student doesn`t exist, return "Wrong number"
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Andrea", "Bahridin", "Anthony", "Arthur", "Ufuk", "Sebahattin", "Dilnoza", "Tohir", "Besime", "Malika", "Mustafa", "Ibrahim", "Mehmet Ali"));
        System.out.println(names);
        ArrayList<String> phoneNumbers = new ArrayList<>(Arrays.asList("(570) 899-6329", "(885) 553-4829", "(677) 374-5873", "(513) 224-9164", "(958) 338-2735", "(398) 619-7665", "(434) 494-4764", "(229) 230-5207", "(463) 612-2498", "(388) 829-6837", "(832) 305-6110", "(445) 553-6905", "(490) 849-4996"));
        System.out.println(phoneNumbers);
        LinkedHashMap<String, String> namesAndNums = new LinkedHashMap<>(getNamesAndNumbers(names, phoneNumbers));
        System.out.println(namesAndNums);
        System.out.println(getNumber(namesAndNums));
    }
    static HashMap<String, String> getNamesAndNumbers(ArrayList<String> name, ArrayList<String> num) {
        LinkedHashMap<String, String> namesAndNums = new LinkedHashMap<>();
        for (int i = 0; i < name.size(); i++) {
            namesAndNums.put(name.get(i), num.get(i));
        }
        return namesAndNums;
    }
    static String getNumber(HashMap<String, String> map) {
        Scanner scan = new Scanner(System.in);
        String number = "";
        System.out.print("Enter name of student: ");
        String name = scan.nextLine();

        for (String n : map.keySet()) {
            if(map.containsKey(name)){
                return map.get(name);
            }
        }
        return "Wrong number";
    }
}
