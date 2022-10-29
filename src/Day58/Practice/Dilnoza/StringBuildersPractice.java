package Day58.Practice.Dilnoza;

public class StringBuildersPractice {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello World");
        System.out.println("sb = " + sb);
        sb.insert(0,"123");
        System.out.println("sb = " + sb);
        sb.insert(6,"Mama Mia");
        sb.reverse();
        System.out.println("sb = " + sb);
    }
}
