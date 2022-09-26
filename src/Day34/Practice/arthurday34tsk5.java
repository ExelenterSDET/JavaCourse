package Day34.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class arthurday34tsk5 {

    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>(Arrays.asList( "Andrea", "Bahridrin" , "Anthony", "Arthur", "Ufuk", "Sebahattin", "Dilnoza", "Tohir", "Besime", "Malika", "Mustafa", "Ibrahim", "Mehmet Ali"));

        ArrayList<String> phone = new ArrayList<>(Arrays.asList("(570) 899-6329", "(885) 553-4829", "(677) 374-5873", "(513) 224-9164", "(958) 338-2735", "(398) 619-7665", "(434) 494-4764", "(229) 230-5207", "(463) 612-2498", "(388) 829-6837", "(832) 305-6110", "(445) 553-6905", "(490) 849-4996"));

        System.out.println(lookup(phonebk(name,phone)));

    }

    static HashMap<String, String> phonebk(ArrayList<String> name, ArrayList<String> phone) {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < name.size(); i++) {
            map.put(name.get(i), phone.get(i));
        }
        return map;
    }


    static String lookup(HashMap<String, String> directory) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name ");
        String name = scan.nextLine();
        if(directory.containsKey(name)){
            return directory.get(name);
        } else {
            return "not found";
        }


    }


}
