package str;

/**
 * 描述：1108. IP 地址无效化
 *
 * @author zy
 * @date 2019/10/24 17:15
 */
public class DefangIPaddr {

    public String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (c == '.') {
                builder.append("[.]");
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }

}
