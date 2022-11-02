package OCA.Q52;

import java.util.Arrays;

public class Q52 {
}

class MarkList{
    int num;
    public static void graceMarks(MarkList obj4) {
        obj4.num += 10;
    }

    @Override
    public String toString() {
        return "MarkList{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        MarkList obj1 = new MarkList();
        MarkList obj2 = obj1;
        MarkList obj3 = null;
        obj2.num = 60;
        graceMarks(obj2);
    }
}
