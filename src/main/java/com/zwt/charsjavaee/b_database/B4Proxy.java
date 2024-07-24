package com.zwt.charsjavaee.b_database;

import com.zwt.charsjavaee.b_database.chars.StudentInterface;
import com.zwt.charsjavaee.b_database.chars.Student;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Dynamic proxy: change the output of the method without rewriting Class file
 * Proxy has 2 kind of objects:
 * 1. Real object instance that created by constructor
 * 2. Proxy object which is an object in the memory
 * Constraint: The two kind of objects implement the same interface
 * Proxy Method: Proxy.newProxyInstance()
 */
public class B4Proxy {
    public static void main(String[] args) {
        Student student = new Student();
//        student.study("Math");
//        student.askQuestion();
        //Keep Student Class, use Proxy pattern to output "Study Programming" using study methods
        StudentInterface proxyStu = (StudentInterface) Proxy.newProxyInstance(
                student.getClass().getClassLoader(),
                new Class[]{StudentInterface.class},
                new InvocationHandler() {
                    //If any method in the Student Class is ready to run,
                    //invoke method in InvocationHandler will be executed.
                    //For example, if study() is ready to run, we should enhance the study() using proxy.
                    //Otherwise, if askQuestion() is ready to run, we should call the askQuestion() method in the Student class
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if(method.getName().equals("study")){
                            System.out.println("Study Programming");
                            return null;
                        } else {
                            return method.invoke(student,args);
                        }
                    }
                }
        );

        proxyStu.askQuestion();
        proxyStu.study();

    }
}
