package Day29.Practice;

public class Furkat {

/*
        Task 1. Laptop Price

        You have a laptop specifications which is stored in the ArrayList as follows:
        [Brand, Model, Ram, CPU, Color]

        example:
        [Apple, Mac Mini, 4 gb, i5, Red]
        [Apple, Mac Middle, 8 gb, i5, Black]
        [Apple, Mac Max, 8 gb, i7, Silver]
        [Apple, Mac Max, 16 gb, i7, Red]
        [Apple, Mac Max, 32 gb, i7, Black]
        [Samsung , Creator Mini, 4 gb, i3, Red]
        [Samsung, Creator Middle, 8 gb, i5, Black]
        [Samsung, Creator Max, 16 gb, i7, Orange]
        [Samsung, Creator Max, 32 gb, i7, Red]

        To get the totalPrice for the laptop, you need to calculate each specification separately.

        1. Get Brand Price:
            Create a method which will have ArrayList<String> as a parameter and will return int(price).
            Price for Apple is 500
            Price for Samsung is 350

        2. Get Model Price:
           Create a method which will have ArrayList<String> as a parameter and will return int(price).
           if Model contains "Mini" add 100 to price
           if Model contains "Middle" add 200 to price
           if Model contains "Max" add 300 to price

       3. Get Ram Price:
           Create a method which will have ArrayList<String> as a parameter and will return int(price).
           if ram is 32 gb add 300 to price
           if ram is 16 gb add 200 to price
           if ram is 8 gb add 100 to price
           if ram is 4 gb add 50 to price

       4. Get CPU Price:
           Create a method which will have ArrayList<String> as a parameter and will return int(price).
           if CPU is i3 add 200 to price
           if CPU is i5 add 300 to price
           if CPU is i7 add 500 to price

       5. Get Color Price:
          Create a method which will have ArrayList<String> as a parameter and will return int(price).
          if Color is Red add 400 to price
          if Color is Orange add 300 to price
          if Color is Silver add 200 to price
          if Color is Black add 150 to price

       6. Get Total Laptop Price:
         Create a void method which will have ArrayList<String> as a parameter and will print total price.
         Calculate total for a laptop according to the laptop specification.
         note: reuse methods 1,2,3,4,5 within this method.

============================================================================

                Task 2.

            1. Using Scanner class, and using conditional loop, ask user to provide any int numbers and add to the ArrayList<Integer>.
               When user enters number less than 0, don`t add to the ArrayList and print the result.

               Example: [1, 5, 10, 25, 30]

            2. Ask User to provide two indexes between 0 and the last index of the ArrayList.
               If user provides number between 0 and the last index, switch values in the ArrayList and print the result.
               Example: user provided indexed 1 and 3 => output should be [1, 25, 10, 5, 30] ==> since index 1 was 5, index 3 was 25

               If user provides indexes out of range, switch first and last objects of ArrayList.
               Example: user provided indexed 0 and 10 => output should be [1, 5, 10, 25, 30] ==> since index 10 is out of the index range

============================================================================

             Task 3
             Create a method which will take two lists as parameter and return
             a new list with all values of the first list that are not in the second list.
             Return ArrayList

             Example:

             Input:
             [1, 2, 3, 4] and [1, 4, 5, 9]

             Output:
             [2, 3]

============================================================================
            Task 4
            Create a method that takes two lists as parameter and return a new list with all values that are only in one of both lists
            Return ArrayList

            Example:

            Input:
            [1, 2, 3, 4] and [1, 4, 5, 9]
            Output:
            [2, 3, 5, 9]

============================================================================

            Task 5
            Create a method that has two Arraylists of Strings as a parameter and return ArrayList of Strings

            take as first value for the new list the first value from the first list
            take as next value for the new list the first value from the second list
            take as next value for the new list the second value from the first list …
            until all values from both lists are in the new list.

            Example:
            Given two lists of same size,
            list1 = [“a”, “b”, “c”] and list2 = [“x”, “y”, “z”]

            result list should be = [“a”,”x”,”b”,”y”,”c”,”z”]

            Example:
            Given two lists of different size
            list1 = [“a”, “b”, “c”, “x”] and list2 = [“y”, “z”]

            result list should be = [“a”,”y”,”b”,”z”,”c”,”x”]

============================================================================

            Task 6
            Create a void method that has an Arraylists of Integer as a parameter

            Count how many each Integer object repeats. Print the result.

            Example:
            [1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1]

            output should be:
            1 = 3; 2 = 2; 3 = 2, 4 = 2, 5 = 2, 6 = 1;

============================================================================

            Task 7
            Create a method that has an Arraylists of Integer as a parameter.

            Remove all duplicates and return new ArrayList of Integer

            Example:
            [1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1]

            output should be:
            [1,2,3,4,5,6]

============================================================================

            Task 8

           1. Create a method that has an int as parameter.
              Check if a number is a prime number. Note: Prime numbers are numbers divisible only by 1 and themselves.

           2. Create a void method which will do following function:

              Using Scanner class, ask user to provide a number.
              If a number is a prime number, inform the user and terminate the program.
              If it is not, ask the user to try again, until they find a prime number.
              Maximum number attempts should be 10.

============================================================================

           Task 9

           Create a method that has an int[] as parameter.
           Every element in the array appears twice except for one.
           Find that single one and return.

            Example s:
            Input: nums = [2,2,1]
            Output: 1

            Input: nums = [4,1,2,1,2]
            Output: 4

            Input: nums = [1]
            Output: 1

     */




}
