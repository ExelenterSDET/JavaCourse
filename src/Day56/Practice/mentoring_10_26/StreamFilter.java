package Day56.Practice.mentoring_10_26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {

        List<String> str = Arrays.asList("Tommy", "Mike", "John");

        List<String> strings = startsWithT(str);
        System.out.println("strings = " + strings);

        List<String> newList = str.stream().filter(eachString -> eachString.startsWith("T")).toList();
       // newList.add("Dave");
        System.out.println("newList = " + newList);

        List<String> newList2 = str.stream().filter(eachString -> eachString.startsWith("T")).collect(Collectors.toList());
        newList2.add("Dave");
        System.out.println("newList2 = " + newList2);


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
