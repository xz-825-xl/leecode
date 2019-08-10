package thread;

import java.util.concurrent.CountDownLatch;

/**
 * @author Zhangying
 * @date 2019/8/5
 * leeCode 1114
 */
public class Foo {
    CountDownLatch countDownLatch1 = new CountDownLatch(1);
    CountDownLatch countDownLatch2 = new CountDownLatch(2);

    public Foo() {
    }

    public void first(Runnable printFirst) throws InterruptedException {

        printFirst.run();
        countDownLatch1.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        countDownLatch1.await();
        printSecond.run();
        countDownLatch2.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        countDownLatch2.await();
        printThird.run();

    }
}
