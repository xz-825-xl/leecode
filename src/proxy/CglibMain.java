package proxy;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;
import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 描述：
 *
 * @author zy
 * @date 2019/12/19 13:12
 */
public class CglibMain {
    public void test(){
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\java\\java_workapace");
        testMethodInterceptor();
        //testInvocationHandler();
        //testFixedValue();
    }

    private static void testMethodInterceptor() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CglibMain.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                System.out.println("before method run...");
                Object result = proxy.invokeSuper(obj, args);
                System.out.println("after method run...");
                return result;
            }
        });
        CglibMain sample = (CglibMain) enhancer.create();
        sample.test();
    }

    private static void testInvocationHandler(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CglibMain.class);
        enhancer.setCallback(new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if(method.getDeclaringClass() != Object.class && method.getReturnType() == String.class){
                    return "hello cglib";
                }else{
                    throw new RuntimeException("Do not know what to do");
                }
            }
        });
        CglibMain proxy = (CglibMain) enhancer.create();
        proxy.test();
    }

    public static void testFixedValue(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CglibMain.class);
        enhancer.setCallback(new FixedValue() {
            @Override
            public Object loadObject() throws Exception {
                return "Hello cglib";
            }
        });
        CglibMain proxy = (CglibMain) enhancer.create();
        proxy.test(); //拦截test，输出Hello cglib
        System.out.println(proxy.toString());
        System.out.println(proxy.getClass());
    }

}
