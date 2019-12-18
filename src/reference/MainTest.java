package reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.LinkedList;
import java.util.Objects;

/**
 * 描述：
 *
 * @author zy
 * @date 2019/12/17 20:55
 */
public class MainTest {

    public static void main(String[] args) throws InterruptedException {
        MyProject myProject = new MyProject();
        myProject.setName("abcd");
        ReferenceQueue<MyProject> queue = new ReferenceQueue<>();
        PhantomReference<MyProject> softReference = new PhantomReference<>(myProject, queue);
        //myProject = null;
        System.gc();
        Thread.sleep(10000);
        System.out.println(Objects.isNull(queue.poll()));
        System.out.println(Objects.isNull(softReference.get()));
    }
}
