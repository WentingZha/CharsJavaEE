package com.zwt.charsjavaee.h_spring_aop.h2_cglib_proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyTest {

    public static void main(String[] args) {
        final Target target = new Target();
        final Advice advice = new Advice();

        //Create an enhancer
        Enhancer enhancer = new Enhancer();
        //Set super class
        enhancer.setSuperclass(target.getClass());
        //Set Call back
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                //enhance before
                advice.enhanceBefore();
                //Invoke object
                Object invoke = method.invoke(target, args);
                //enhance after
                advice.afterReturning();
                return invoke;
            }
        });

        //Create proxy object
        Target target1 = (Target) enhancer.create();
        target1.buildCabin();
    }

}
