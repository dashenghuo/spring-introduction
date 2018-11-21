package introduction.aop.cglib;




import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 *  静态代理是通过在代码中显式定义一个业务实现类一个代理，在代理类中对同名的业务方法进行包装，用户通过代理类调用被包装过的业务方法；
 *  JDK动态代理是通过接口中的方法名，在动态生成的代理类中调用业务实现类的同名方法；
 *  CGlib动态代理是通过继承业务类，生成的动态代理类是业务类的子类，通过重写业务方法进行代理；
 *  JDK和Cglib都是在运行期生成字节码，JDK是直接写Class字节码，Cglib使用ASM框架写Class字节码，Cglib代理实现更复杂，生成代理类比JDK效率低。
 *  JDK调用代理方法，是通过反射机制调用，Cglib是通过FastClass机制直接调用方法，Cglib执行效率更高。
 */
public class CalculatorLogCglibProxy implements MethodInterceptor {

    /**
     * 业务类对象，供代理方法中进行真正的业务方法调用
     */
    private Object target;

    /**
     * 创建动态代理类对象, 相当于JDK动态代理中的绑定
     * @param obj 业务对象赋值
     * @return 动态代理类对象
     */
    public Object getInstance(Object obj){
        // 给业务对象赋值
        this.target = obj;
        // 创建加强器，用来创建动态代理类
         Enhancer enhancer = new Enhancer();
        // 为加强器指定要代理的业务类（即：为下面生成的代理类指定父类）
        enhancer.setSuperclass(obj.getClass());
        // 设置回调：对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实现intercept()方法进行拦
        enhancer.setCallback(this);
        // 创建动态代理类对象并返回
        return enhancer.create();
    }

    /**
     * 实现回调方法
     * @param proxy   业务对象
     * @param method 业务对象方法
     * @param args 方法参数
     * @param methodProxy  代理
     * @return  业务对象方法返回结果
     * @throws Throwable 异常
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("input parameter: " + Arrays.toString(args));
        Object result =  methodProxy.invoke(target, args);
        System.out.println("result: " +  result);
        return result;
    }



}
