package str;

/**
 * 描述：468. 验证IP地址
 *
 * @author zy
 * @date 2020/3/2 9:53
 */
public class ValidIPAddress {

    private String[] results = new String[]{"IPv4", "IPv6", "Neither"};

    public String validIPAddress(String IP) {
        if (IP == null) {
            return results[2];
        }

        String regex0 = "(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])";
        String regexIPv4 = regex0 + "(\\." + regex0 + "){3}";
        String regex1 = "([\\da-fA-F]{1,4})";
        String regexIPv6 = regex1 + "(:" + regex1 + "){7}";

        String result = results[2];
        if (IP.matches(regexIPv4)) {
            result = results[0];
        } else if (IP.matches(regexIPv6)) {
            result = results[1];
        }
        return result;
    }
}
