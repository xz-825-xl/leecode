package str;

/**
 * 描述：844. 比较含退格的字符串
 * todo
 * @author Zhangying
 * @date 2020/10/19 13:51
 */
public class BackspaceCompare {

    public boolean backspaceCompare(String S, String T) {
        int indexS = S.length() - 1;
        int indexT = T.length() - 1;
        int spaceCount;
        while (indexS >= 0 && indexT >= 0) {

            while (indexS >= 0 && S.charAt(indexS) == '#') {
                spaceCount = 0;
                while (indexS >= 0 && S.charAt(indexS) == '#') {
                    spaceCount++;
                    indexS--;
                }
                indexS -= spaceCount;
            }

            while (indexT >= 0 && T.charAt(indexT) == '#') {
                spaceCount = 0;
                while (indexT >= 0 && T.charAt(indexT) == '#') {
                    spaceCount++;
                    indexT--;
                }
                indexT -= spaceCount;
            }


            if(indexS < 0 && indexT < 0) {
                return true;
            } else if(indexS < 0 || indexT < 0 || S.charAt(indexS) != T.charAt(indexT)){
                return false;
            }

            indexS--;
            indexT--;
        }
        return indexS < 0 && indexT < 0;
    }

    public static void main(String[] args) {
        //System.out.println(new BackspaceCompare().backspaceCompare("ab##", "c#d#"));
        //System.out.println(new BackspaceCompare().backspaceCompare("a##c", "#a#c"));
        System.out.println(new BackspaceCompare().backspaceCompare("bxj##tw", "bxo#j##tw"));
    }

}
