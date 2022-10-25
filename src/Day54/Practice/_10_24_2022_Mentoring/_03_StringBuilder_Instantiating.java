package Day54.Practice._10_24_2022_Mentoring;

public class _03_StringBuilder_Instantiating {

    public static void main(String[] args) {
        String str = "Hello";
        StringBuilder sb1 = new StringBuilder(str);
        System.out.println("sb1 = " + sb1);

        StringBuilder sb2 = new StringBuilder(sb1);
        System.out.println("sb2 = " + sb2);

        StringBuilder sb3 = new StringBuilder(" World");
        System.out.println("sb3 = " + sb3);

        StringBuilder sb4 = new StringBuilder();

        // append();
        sb1.append('c');
        sb1.append(123456);
        sb1.append(false);
        sb1.append(new String("Java"));
        System.out.println("sb1 = " + sb1);

        // delete(); deleteCharAt();
        sb1.delete(0,1);
        System.out.println("sb1 = " + sb1);

        sb1.deleteCharAt(10);
        System.out.println("sb1 = " + sb1);

        // insert();
        char [] ch = {'a', 'b', 'c'};
        sb1.insert(sb1.length(), ch);
        sb1.insert(3, 3);
        System.out.println("sb1 = " + sb1);

        // reverse();
        sb2.reverse();
        System.out.println("sb2 = " + sb2);

    }
}
