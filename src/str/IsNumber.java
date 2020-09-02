package str;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述：剑指 Offer 20. 表示数值的字符串
 *
 * @author Zhangying
 * @date 2020/9/2 9:07
 */
public class IsNumber {
    public boolean isNumber(String s) {
        Map<PROCESS, Map<TYPE, PROCESS>> transfer = new HashMap<>();
        Map<TYPE, PROCESS> initMap = new HashMap<>() {{
            put(TYPE.EMPTY, PROCESS.INIT);
            put(TYPE.INTEGER, PROCESS.INTEGER);
            put(TYPE.SIGN, PROCESS.SIGN);
            put(TYPE.POINT, PROCESS.POINT);
        }};

        transfer.put(PROCESS.INIT, initMap);
        Map<TYPE, PROCESS> signMap = new HashMap<>() {{
            put(TYPE.INTEGER, PROCESS.INTEGER);
            put(TYPE.POINT, PROCESS.POINT);
        }};
        transfer.put(PROCESS.SIGN, signMap);

        Map<TYPE, PROCESS> integerMap = new HashMap<>() {{
            put(TYPE.INTEGER, PROCESS.INTEGER);
            put(TYPE.E, PROCESS.E);
            put(TYPE.POINT, PROCESS.INTEGER_POINT);
            put(TYPE.EMPTY, PROCESS.END);
        }};
        transfer.put(PROCESS.INTEGER, integerMap);

        Map<TYPE, PROCESS> intPointMap = new HashMap<>() {{
            put(TYPE.INTEGER, PROCESS.POINT_NUMBER);
            put(TYPE.E, PROCESS.E);
            put(TYPE.EMPTY, PROCESS.END);
        }};
        transfer.put(PROCESS.INTEGER_POINT, intPointMap);

        Map<TYPE, PROCESS> pointMap = new HashMap<>() {{
            put(TYPE.INTEGER, PROCESS.POINT_NUMBER);
            put(TYPE.E, PROCESS.E);
        }};
        transfer.put(PROCESS.POINT, pointMap);

        Map<TYPE, PROCESS> pointWithoutIntMap = new HashMap<>() {{
            put(TYPE.INTEGER, PROCESS.POINT_NUMBER);
            put(TYPE.E, PROCESS.E);
            put(TYPE.EMPTY, PROCESS.END);
        }};
        transfer.put(PROCESS.POINT_NUMBER, pointWithoutIntMap);

        Map<TYPE, PROCESS> eMap = new HashMap<>() {{
            put(TYPE.INTEGER, PROCESS.E_NUMBER);
            put(TYPE.SIGN, PROCESS.E_SIGN);
        }};
        transfer.put(PROCESS.E, eMap);

        Map<TYPE, PROCESS> eSignMap = new HashMap<>() {{
            put(TYPE.INTEGER, PROCESS.E_NUMBER);
        }};
        transfer.put(PROCESS.E_SIGN, eSignMap);

        Map<TYPE, PROCESS> eNumberMap = new HashMap<>() {{
            put(TYPE.INTEGER, PROCESS.E_NUMBER);
            put(TYPE.EMPTY, PROCESS.END);
        }};
        transfer.put(PROCESS.E_NUMBER, eNumberMap);

        Map<TYPE, PROCESS> eSignNumberMap = new HashMap<>() {{
            put(TYPE.INTEGER, PROCESS.E_SIGN_NUMBER);
            put(TYPE.EMPTY, PROCESS.END);
        }};
        transfer.put(PROCESS.E_SIGN_NUMBER, eSignNumberMap);

        Map<TYPE, PROCESS> endMap = new HashMap<>() {{
            put(TYPE.EMPTY, PROCESS.END);
        }};
        transfer.put(PROCESS.END, endMap);

        int length = s.length();
        PROCESS process = PROCESS.INIT;

        for (int i = 0; i < length; i++) {
            TYPE type = toCharType(s.charAt(i));
            if (!transfer.get(process).containsKey(type)) {
                return false;
            } else {
                process = transfer.get(process).get(type);
            }
        }
        return process == PROCESS.INTEGER
                || process == PROCESS.INTEGER_POINT
                || process == PROCESS.POINT_NUMBER
                || process == PROCESS.E_NUMBER
                || process == PROCESS.E_SIGN_NUMBER
                || process == PROCESS.END;

    }

    public TYPE toCharType(char ch) {
        if (ch >= '0' && ch <= '9') {
            return TYPE.INTEGER;
        } else if (ch == 'e' || ch == 'E') {
            return TYPE.E;
        } else if (ch == '.') {
            return TYPE.POINT;
        } else if (ch == '+' || ch == '-') {
            return TYPE.SIGN;
        } else if (ch == ' ') {
            return TYPE.EMPTY;
        } else {
            return TYPE.ILLEGAL;
        }
    }

    enum PROCESS {
        INIT,
        SIGN,
        INTEGER,
        INTEGER_POINT,
        POINT,
        POINT_NUMBER,
        E,
        E_SIGN,
        E_SIGN_NUMBER,
        E_NUMBER,
        END
    }

    enum TYPE {
        EMPTY,
        SIGN,
        INTEGER,
        E,
        POINT,
        ILLEGAL
    }

    public static void main(String[] args) {
        // +100"、"5e2"、"-123"、"3.1416"、"-1E-16"、"0123"都表示数值，
        // 但"12e"、"1a3.14"、"1.2.3"、"+-5"及"12e+5.4

        System.out.println(new IsNumber().isNumber("+100"));
        System.out.println(new IsNumber().isNumber("5e2"));
        System.out.println(new IsNumber().isNumber("-123"));
        System.out.println(new IsNumber().isNumber("3.1416"));
        System.out.println(new IsNumber().isNumber("-1E-16"));
        System.out.println(new IsNumber().isNumber("0123"));
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        System.out.println(new IsNumber().isNumber("12e"));
        System.out.println(new IsNumber().isNumber("1a3.14"));
        System.out.println(new IsNumber().isNumber("1.2.3"));
        System.out.println(new IsNumber().isNumber("+-5"));
        System.out.println(new IsNumber().isNumber("12e+5.4"));
    }
}
