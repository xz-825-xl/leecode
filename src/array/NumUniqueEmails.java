package array;

import java.util.HashSet;
import java.util.Set;

/**
 * 描述：929. 独特的电子邮件地址
 *
 * @author zy
 * @date 2019/9/30 8:34
 */
public class NumUniqueEmails {

    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            String[] array = emails[i].split("@");
            String prefix = array[0];
            prefix = prefix.replace(".", "");
            if(prefix.indexOf("+") != -1){
                prefix = prefix.substring(0, prefix.indexOf("+"));
            }
            set.add(prefix + "@" + array[1]);
        }
        return set.size();
    }

}
