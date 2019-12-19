package proxy;


import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

/**
 * 描述：
 *
 * @author zy
 * @date 2019/12/18 16:07
 */
public class MyDynamicProxy {
    public static void main (String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HelloImpl2 hello = new HelloImpl2();
        MyInvocationHandler handler = new MyInvocationHandler(hello);
        // 构造代码实例
//        Hello proxyHello = (Hello) Proxy.newProxyInstance(HelloImpl.class.getClassLoader(), HelloImpl.class.getInterfaces(), handler);
//        // 调用代理方法
//        proxyHello.sayHello();

        Hello proxyHello2 = (Hello) Proxy.newProxyInstance(HelloImpl2.class.getClassLoader(), HelloImpl2.class.getInterfaces(), handler);
        proxyHello2.sayHello();

        Object obj =  Proxy.newProxyInstance(HelloImpl2.class.getClassLoader(), HelloImpl2.class.getInterfaces(), handler);
        Method method = obj.getClass().getMethod("sayHello");
        method.invoke(obj);

        byte[] bytes = ProxyGenerator.generateProxyClass("com.sun.proxy.$Proxy0", HelloImpl2.class.getInterfaces(), 1);
        try{
            FileOutputStream out = new FileOutputStream( "proxy.class" );
            out.write( bytes );
            out.close();
        }catch( Exception e ) {
            e.printStackTrace();
        }
    }
}
