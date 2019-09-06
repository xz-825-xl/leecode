package str;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：438. 找到字符串中所有字母异位词
 *
 * @author zy
 * @date 2019/9/6 8:44
 */
public class FindAnagrams {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> rs = new ArrayList<>();
        int index = 0;
        String temp = p;
        for (int i = 0; i <= s.length(); i++) {
            if (temp.length() == 0) {
                rs.add(index);
                if (i < s.length() && s.charAt(index) != s.charAt(i)) {
                    temp = p;
                    i = index;
                }
                index++;
            } else if (i < s.length() && temp.indexOf(s.charAt(i)) != -1) {
                temp = temp.replaceFirst(s.charAt(i) + "", "");
            } else if(i < s.length() && p.indexOf(s.charAt(i)) != -1){
                i = index;
                index++;
                temp = p;
            }else{
                index = i + 1;
                temp = p;
            }
        }
        return rs;
    }


}
