package Day34.Practice;

public class Furkat {
    /*

    Task 1

        1. Create a method which will return int[]. Parameter is int (n).
           The length of array is n.
           Using Random class, assign to each index of array a random number between 10 and 20.

        2. Create a method which will return a HashMap.
           Parameter will be int[].

           Return how many times each int of array repeats.

           Example:
           [10,11,12,13,10,11,12,13]

           Result:
           10 = 2; 11=2, 12=2, 13=2

    Task 2

        Create a method, which will return a character and parameter is a String.
        Given a string consisting of lowercase Latin Letters.
        Return the first non-repeating character in the string.
        If there is no non-repeating character, return '$'.

        Example:
        String = zxvczbtxyzvy

        Result: c


    Task 3

        Create a method, which will return a ArrayList<Integer> and parameter is a ArrayList<Integer>.
        The method should sort the ArrayList.

        Note: Don`t use any of built-in sort methods.

        Example:
        {5,4,2,1,0,3}

        Result: {0,1,2,3,4,5}


    Task 4
        1. Create a method which will return ArrayList<Integer> with no parameters.
           Add 10 random numbers between 0 and 10 to the list.

        2. Create a method which will return true or false.
           Parameter is ArrayList<Integer>, and int (X).
           Determine whether there exist two elements in the list whose sum is exactly X.

          Example:

          {1, 4, 45, 6, 10, 8} and X = 16
          Result = true;

          {1, 2, 4, 3, 6} and X = 11
          Result = false;

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


     Task 6.

         Given an ArrayList<Characters> as a parameter.
         {a b c e f a t d a l m u v x a e b d}
         1. Create a method to return ArrayList<Character> with the unique values and in the descending order.

         2. Create a method to return HashMap<Character, Integer>.
            The Parameter is ArrayList<Character>. (The list must be sorted in descending order have only unique values.)
            Add each character as a key to the map and its ASCII code as a value.

         3. Create a method which will have HashMap<Character, Integer> as a parameter and will return a double.
            Return the average of all values of a map. double number must have only 2 decimals. (Example: 10.25)

     Task 7.

           Create 2 HashSet<Characters> objects.
           Keep adding random lowercase letters to the set until the size of each set is 10.

           1. Create a method to return the ArrayList of unique characters both of the sets have.
           2. Create a method to return the ArrayList of shared characters both of the sets have.
           3. Create a method to return the ArrayList of characters which are only in the first set.

     Task 8

           Create a method which will have as a parameter an array of strings.
           Return a Map<String, Boolean> where each different string is a key and
           its value is true if that string appears 2 or more times in the array.

           Example:
           ["a", "b", "a", "c", "b"]
           Result:
           {"a": true, "b": true, "c": false}

    Task 9

          Given a HashMap<String, String>.
          The map has keys and values as follow:
          {"spinach": "dirt", "ice cream": "cherry"}


          Create a method with HashMap<String, String> parameter, return same type of map.
          The method should modify the map as follow:

          if the key is "ice cream", create a new key as "yogurt" and value should be the same as for "ice cream".
          If the key is "spinach", change that value to "nuts".

          Example:
          {"spinach": "dirt", "ice cream": "cherry"}

          Result:
          {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}

     Task 10

          Given a following Map:

          HashMap<String, ArrayList<String>> map = new HashMap<>();
          map.put("USA", new ArrayList(Arrays.asList("Boston","NewYork","San-Francisco")));
          map.put("INDIA", new ArrayList(Arrays.asList("Bangalore","Mumbai","Delhi")));
          map.put("UK", new ArrayList(Arrays.asList("Leicester","London","Birmingham")));

          1. Create a method, which has ArrayList<String> and a Character as a parameters and a ArrayList<String> return type.
          The method should modify list, so that it will remove all Cities from the list, which start with the Character.

          2. Create a method, which has HashMap<String, ArrayList<String>> as a parameter and a return type.
          The method should modify the map as follow:
          if the country is USA, remove all cities from the list, that starts with S.
          if the country is INDIA, remove all cities from the list, that starts with M.
          if the country is UK, remove all cities from the list, that starts with B
     */
}
