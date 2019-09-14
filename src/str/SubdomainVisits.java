package str;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zy on 2019/9/14.
 * To be a happy coder!
 * 811. 子域名访问计数
 */
public class SubdomainVisits {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] array = cpdomain.split(" ");
            String domain = array[1];
            while (domain.indexOf(".") != -1) {
                map.put(domain, map.getOrDefault(domain, 0) + Integer.parseInt(array[0]));
                domain = domain.substring(domain.indexOf(".") + 1);
            }
            map.put(domain, map.getOrDefault(domain, 0) + Integer.parseInt(array[0]));
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry.getValue() + " " + entry.getKey());
        }
        return list;
    }
}
