package str;

import java.util.HashSet;
import java.util.Set;

/**
 * 824. 山羊拉丁文
 * Created by zy on 2019/11/2.
 * To be a happy coder!
 */
public class ToGoatLatin {
    public String toGoatLatin(String S) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        String[] array = S.split(" ");
        StringBuilder builder = new StringBuilder("maa");
        for (int i = 0; i < array.length; i++) {
            String temp = array[i];
            if(!set.contains(temp.toUpperCase().charAt(0)) && !set.contains(temp.toLowerCase().charAt(0))){
                temp = temp.substring(1) + temp.charAt(0);
            }
            array[i] = temp + builder.toString();
            builder.append("a");
        }
        return String.join(" ", array);
    }
}
