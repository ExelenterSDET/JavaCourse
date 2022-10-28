package Day57.Practice.Andrea.Mentoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Tommy", "Mike", "John");
        System.out.println(startsWithT(str));

        List<String> newList = str.stream().filter(eachString -> eachString.startsWith("T")).toList();
        System.out.println(newList);

        List<String> newList2 = str.stream().filter(eachString -> eachString.startsWith("T")).collect(Collectors.toList());
        //this one can be changed - other one cannot
        newList2.add("Dave");
        System.out.println(newList2);
    }

    static List<String> startsWithT(List<String> list){
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).charAt(0)=='T'){
                newList.add(list.get(i));
            }
        }
        return newList;
    }
}
