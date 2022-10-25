package Day55.Practice._10_25_2022_Mentoring;

public class OCA1 {

/*    Which statement will empty the contents of a StringBuilder variable named sb?
1.	sb. deleteAll ();
2.	sb. delete (0, sb. size () );
3.	sb. delete (0, sb. length () );
4.	sb. removeAll ();
*/

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.delete(0, sb.length());
        System.out.println("sb = " + sb); // Answer is 3
    }

}
