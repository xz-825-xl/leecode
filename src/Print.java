import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 描述：三个线程交替打印alialiali...，一个打印a，一个打印l，一个打印i
 *
 * @author zy
 * @date 2020/6/3 14:51
 */
public class Print {

    private static CountDownLatch countDownLatch = new CountDownLatch(1);
    private static CountDownLatch countDownLatch2 = new CountDownLatch(1);

    public static class PrintA extends Thread {
        @Override
        public void run() {
            System.out.println("a");
            countDownLatch.countDown();
        }
    }

    public static class PrintL extends Thread {
        @Override
        public void run() {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("l");
            countDownLatch2.countDown();
            countDownLatch = new CountDownLatch(1);
        }
    }

    public static class PrintI extends Thread {
        @Override
        public void run(){
            try {
                countDownLatch2.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("i");
            countDownLatch2 = new CountDownLatch(1);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = new ThreadPoolExecutor(3, 3, 100, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        while (true){
            executorService.execute(new PrintA());
            executorService.execute(new PrintL());
            executorService.execute(new PrintI());
            Thread.sleep(1000);
        }
    }
}
