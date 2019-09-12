package str;

/**
 * 描述：748: 最完整单词
 *
 * @author zy
 * @date 2019/9/12 8:42
 */
public class ShortestCompletingWord {
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        String rs = "";
        StringBuilder builder = new StringBuilder();
        for (char c : licensePlate.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                builder.append(Character.toLowerCase(c));
            }
        }
        char[] templates = builder.toString().toCharArray();
        int shortLength = Integer.MAX_VALUE;
        for (String word : words) {
            if(word.length() >= shortLength){
                continue;
            }
            char[] arrays;
            String temp = word;
            boolean flag = true;
            for (int i = 0; i < templates.length; i++) {
                arrays = temp.toLowerCase().toCharArray();
                if (temp.indexOf(templates[i]) != -1) {
                    System.arraycopy(arrays, temp.indexOf(templates[i]) + 1,
                            arrays, temp.indexOf(templates[i]), temp.length() - temp.indexOf(templates[i]) - 1);
                    arrays[arrays.length - 1] = ' ';
                    temp = new String(arrays);
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                rs = word;
                shortLength = rs.length();
            }
        }
        return rs;
    }
}
