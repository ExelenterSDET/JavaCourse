package Day34.Practice.Tohir_Week_8;

import java.util.*;

public class Task_5 {
    public static void main(String[] args) {
    Task_5 asg = new Task_5();
    ArrayList<String> strArr_1 = new ArrayList<>(Arrays.asList("Andrea", "Bahridin", "Anthony", "Arthur", "Ufuk", "Sebahattin", "Dilnoza", "Tohir", "Besime", "Malika", "Mustafa", "Ibrahim", "Mehmet Ali"));
    ArrayList<String> strArr_2 = new ArrayList<>(Arrays.asList("(570) 899-6329", "(885) 553-4829", "(677) 374-5873", "(513) 224-9164", "(958) 338-2735", "(398) 619-7665", "(434) 494-4764", "(229) 230-5207", "(463) 612-2498", "(388) 829-6837", "(832) 305-6110", "(445) 553-6905", "(490) 849-4996"));
        System.out.println(asg.Wrightname(strArr_1,strArr_2));
        System.out.println(asg.SWrightname(asg.Wrightname(strArr_1,strArr_2)));
    }

    HashMap<String, String> Wrightname(ArrayList<String> strArr_1,ArrayList<String> strArr_2)
    {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < strArr_1.size(); i++) {
            for (int i1 = 0; i1 < strArr_2.size(); i1++) {
                if(i==i1)
                {
                    map.put(strArr_1.get(i),strArr_2.get(i));
                }
            }
        }
        return map;
    }
    String SWrightname(HashMap<String, String> strArr)
    {
        Scanner scan = new Scanner(System.in);
        String returnname = "Wrong number";
        String studname = scan.next();
        for (Map.Entry<String,String> row:strArr.entrySet())
        {
            if (row.getKey().equals(studname))
            {
                returnname = row.getValue();
            }
        }
        return returnname;

    }

    /*
         Task 5

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
}
