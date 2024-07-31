package com.zwt.charsjavaee.h_spring_aop.h1_jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {
        final Target target = new Target();
        Enhancer enhancer = new Enhancer();
        TargetInterface proxy = (TargetInterface) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),//loader of the target class
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        enhancer.enhanceBefore();
                        Object invoke = method.invoke(target, args);
                        enhancer.afterReturning();
                        return invoke;
                    }
                }
        );

        proxy.buildCabin();
    }

}
