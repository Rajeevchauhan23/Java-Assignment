
import java.lang.reflect.Array;
import java.util.ArrayList;

// output is  SPACE,A,B,C,AB,AC,BC,ABC
public class StringSubsequence {
    public static void main (String [] args) {
        String str = "ABC";
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if( list.isEmpty()) {
                list.add("");
                list.add(""+ch);
             continue; 
            }
            int listSize = list.size();
            for (int j = 0; j < listSize; j++) {
                list.add(list.get(j)+ch);
            }
        }   
        System.out.println(list);
    }
}