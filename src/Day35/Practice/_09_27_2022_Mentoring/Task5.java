package Day35.Practice._09_27_2022_Mentoring;

import java.util.*;

public class Task5 {
/*    Task 5
    Given two ArrayList<String>
    the data of the lists are as below:
    {Andrea, Bahridin, Anthony, Arthur, Ufuk, Sebahattin, Dilnoza, Tohir, Besime, Day34.Day37.Practice.Malika, Mustafa, Ibrahim, Mehmet Ali}
    {(570) 899-6329, (885) 553-4829, (677) 374-5873, (513) 224-9164, (958) 338-2735, (398) 619-7665, (434) 494-4764, (229) 230-5207, (463) 612-2498, (388) 829-6837, (832) 305-6110, (445) 553-6905, (490) 849-4996}

        1. Create a method which will have parameter as two ArrayList<String>`s
    Add names and phone numbers to the map and return it.
            note: the phone number of a person has been stored under the same index where the persons name is.
    Example:
    Sebahattin is in the index 5. His phone number should be also in the index 5 ( (398) 619-7665 )

            2. Create a method which will have a parameter as a HashMap<String, String> and return type is a String.
    Using Scanner class, provide the name of a Student.
    The method should return the phone number of a Student.
    If Student doesn`t exist, return "Wrong number"*/
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>(Arrays.asList("Andrea", "Bahridin", "Anthony", "Arthur", "Ufuk", "Sebahattin",
                "Dilnoza", "Tohir", "Besime", "Malika", "Mustafa", "Ibrahim", "Mehmet Ali"));

        ArrayList<String> phone = new ArrayList<>(Arrays.asList("(570) 899-6329", "(885) 553-4829", "(677) 374-5873", "(513) 224-9164", "(958) 338-2735",
               " (398) 619-7665", "(434) 494-4764", "(229) 230-5207", "(463) 612-2498", "(388) 829-6837", "(832) 305-6110", "(445) 553-6905"," (490) 849-4996"));


        HashMap<String, String> map = phoneBook(name, phone);
        System.out.println(map);

        String s = provideName3(map);
        System.out.println(s);

    }
    static HashMap<String, String> phoneBook(ArrayList<String> names, ArrayList<String> numbers){
      HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < names.size() ; i++) {
            map.put(names.get(i), numbers.get(i));
        }
        return map;
    }

    static String provideName(HashMap<String, String> map){
        Scanner scan = new Scanner(System.in);
        System.out.print("Eneter the name please : ");
        String name = scan.nextLine();

        for (int i = 0; i <map.size() ; i++) {
            if(map.containsKey(name)){
                return name + " phone number is : " + map.get(name);
            }
        }
        return "Does not exist";
    }

    static String provideName2(HashMap<String, String> map){
        Scanner scan = new Scanner(System.in);
        System.out.print("Eneter the name please : ");
        String name = scan.nextLine();

        for (String eachName:map.keySet()) {
            if(eachName.equals(name)){
                return name + " phone number is : " + map.get(name);
            }
        }
        return "Does not exist";
    }

    static String provideName3(HashMap<String, String> map){
        Scanner scan = new Scanner(System.in);
        System.out.print("Eneter the name please : ");
        String name = scan.nextLine();

        for(Map.Entry<String, String> eachName : map.entrySet()){
            if (name.equals(map.get(name))){
                return name + " phone number is : " + map.get(eachName);
            }
        }
        return "Does not exist";
    }


}
