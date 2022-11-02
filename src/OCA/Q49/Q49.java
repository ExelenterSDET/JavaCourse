package OCA.Q49;

public class Q49 {
    public static void main(String[] args) {
        int array[] = {10,20,30,40,50};
        int x = array.length;
        /* line n1 */
        while (x > 0) { //5 4 3 2 1 0
            System.out.print(array[--x]); // 4 3 2 1 0
        }
    }
}


/*
Which two code fragments can be independently inserted at line n1 to enable the code to print the elements of the array in reverse order? (Choose two.)

A
    while (x > 0) {
        x--;
        System.out.print(array[x]);
      }
B
    do {
        x--;
        System.out.print(array[x]);
     } while (x >= 0);

C
    while (x >= 0) {
        System.out.print(array[x]);
        x--;
      }

D
    do {
        System.out.print(array[x]);
        --x;
     } while (x >= 0);

E
    while (x > 0) {
        System.out.print(array[--x]);
      }

A.	Option A
B.	Option B
C.	Option C
D.	Option D
E.	Option E

 */