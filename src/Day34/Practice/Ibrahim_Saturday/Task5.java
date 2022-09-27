package Day34.Practice.Ibrahim_Saturday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
Task 5

        Given two ArrayList<String>
        the data of the lists are as below:
        {Andrea, Bahridin, Anthony, Arthur, Ufuk, Sebahattin, Dilnoza, Tohir, Besime, Day34.Practice.Malika, Mustafa, Ibrahim, Mehmet Ali}
        {(570) 899-6329, (885) 553-4829, (677) 374-5873, (513) 224-9164, (958) 338-2735, (398) 619-7665, (434) 494-4764,
        (229) 230-5207, (463) 612-2498, (388) 829-6837, (832) 305-6110, (445) 553-6905, (490) 849-4996}

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
public class Task5 {

    static HashMap<String, String> combineNamesAndTels(ArrayList<String> names, ArrayList<String> tels){

        HashMap<String, String> nameAndTels = new HashMap<>();

        for (int i = 0; i < names.size(); i++) {
            nameAndTels.put(names.get(i), tels.get(i));
        }
        return nameAndTels;
    }
    static String findTel(HashMap<String, String> hmap){

        String name = "";
        int flag = 1;

        while(flag == 1){

            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter a student name : ");
            name = scan.nextLine();
            if (hmap.containsKey(name)){
                System.out.println("Phone number of " + name + " is " + hmap.get(name));
            }else{
                System.out.println("There is any student name is " + name);
            }
            System.out.print("Do you want to check for another student? \"y\" or \"n\" " );
            String coninue = scan.nextLine();
            if (coninue.equalsIgnoreCase("n")){
                flag = 0;
            }
        }


    return hmap.get(name);
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Andrea", "Bahridin", "Anthony", "Arthur", "Ufuk",
                "Sebahattin", "Dilnoza", "Tohir", "Besime", "Malika", "Mustafa", "Ibrahim", "Mehmet Ali"));
        ArrayList<String> tels = new ArrayList<>(Arrays.asList("(570) 899-6329", "(885) 553-4829", "(677) 374-5873",
                "(513) 224-9164", "(958) 338-2735", "(398) 619-7665", "(434) 494-4764",
                "(229) 230-5207", "(463) 612-2498", "(388) 829-6837", "(832) 305-6110", "(445) 553-6905",
                "(490) 849-4996"));


        System.out.println(combineNamesAndTels(names, tels));
        findTel(combineNamesAndTels(names, tels));

    }
}
