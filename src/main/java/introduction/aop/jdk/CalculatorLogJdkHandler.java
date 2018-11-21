package introduction.aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 *  静态代理是通过在代码中显式定义一个业务实现类一个代理，在代理类中对同名的业务方法进行包装，用户通过代理类调用被包装过的业务方法；
 *  JDK动态代理是通过接口中的方法名，在动态生成的代理类中调用业务实现类的同名方法；
 *  CGlib动态代理是通过继承业务类，生成的动态代理类是业务类的子类，通过重写业务方法进行代理；
 *  JDK和Cglib都是在运行期生成字节码，JDK是直接写Class字节码，Cglib使用ASM框架写Class字节码，Cglib代理实现更复杂，生成代理类比JDK效率低。
 *  JDK调用代理方法，是通过反射机制调用，Cglib是通过FastClass机制直接调用方法，Cglib执行效率更高。
 */
public class CalculatorLogJdkHandler implements InvocationHandler {

    /**
     * 业务实现类对象，用来调用具体的业务方法
     */
    private Object target;

    public CalculatorLogJdkHandler(Object target){
        super();
        this.target = target;
    }
    /**
     * 绑定业务对象并返回一个代理类
     * 通过反射机制，创建一个代理类对象实例并返回。用户进行方法调用时使用
     * 创建代理对象时，需要传递该业务类的类加载器（用来获取业务实现类的元数据，在包装方法是调用真正的业务方法）、接口、handler实现类
     */
    public static Object createProxy(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new CalculatorLogJdkHandler(target));
    }

    /**
     * 包装调用方法：进行预处理、调用后处理
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 预处理
        System.out.println("input parameter: " + Arrays.toString(args));
        // 调用真正的业务方法
        Object result =  method.invoke(target, args);
        // 调用后处理
        System.out.println("result: " +  result);
        return result;
    }


}
