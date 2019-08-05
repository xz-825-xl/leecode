package list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zy on 2019/8/4.
 * To be a happy coder!
 * leeCode 784
 */
public class LetterCasePermutation {

    public List<String> letterCasePermutation(String S) {
        List<String> list = new ArrayList<>();
        trans(S.toCharArray(), list, 0);
        return list;
    }

    private void trans(char[] chars, List<String> list, int index){
        if(index > chars.length - 1){
            list.add(new String(chars));
            return;
        }
        trans(chars, list, index + 1);
        if(chars[index] < '0' || chars[index] > '9'){
            chars[index] ^= 32;
            trans(chars, list, index + 1);
        }
    }

}
