package list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhangying
 * @date 2019/7/25
 * leeCode 412
 */
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i % 15 == 0 ? "FizzBuzz" : (i % 5 == 0 ? "Buzz" : (i % 3 == 0 ? "Fizz" : String.valueOf(i))));
        }
        return list;
    }

}
