package array;

/**
 * 描述：1160. 拼写单词
 *
 * @author zy
 * @date 2019/10/18 17:15
 */
public class CountCharacters {

    public static int countCharacters(String[] words, String chars) {
        int count = 0;
        char[] temp = chars.toCharArray();
        for (int i = 0; i < words.length ; i++) {
           char[] word = words[i].toCharArray();
           boolean flag = true;
            for (int j = 0; j < word.length ; j++) {
                boolean flag1 = false;
                for (int k = j ; k < temp.length; k++) {
                    if(temp[k] == word[j]){
                        char tp = temp[j];
                        temp[j] = temp[k];
                        temp[k] = tp;
                        flag1 = true;
                        break;
                    }
                }
                if(!flag1){
                    flag = false;
                   break;
                }
            }
            if(flag){
                count+=word.length;
            }
        }
        return count;
    }

}
