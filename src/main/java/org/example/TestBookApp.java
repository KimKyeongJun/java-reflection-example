package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestBookApp {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> bookClass = Class.forName("org.example.TestBook");

        Constructor<?> constructor = bookClass.getConstructor(String.class);

        TestBook testBook = (TestBook) constructor.newInstance("myBook");
        System.out.println(testBook);

        Field a = TestBook.class.getDeclaredField("A");
        System.out.println(a.get(null));
        a.set(null, "BBBB");
        System.out.println(a.get(null));

        Field b = TestBook.class.getDeclaredField("B");
        b.setAccessible(true);
        System.out.println(b.get(testBook));
        b.set(testBook, "BBBBBBBBBBBBBBBBBBB");
        System.out.println(b.get(testBook));


        Method c = TestBook.class.getDeclaredMethod("c");
        c.setAccessible(true);
        c.invoke(testBook);
        System.out.println(c);

        Method d = TestBook.class.getDeclaredMethod("sum", int.class, int.class);
        int invoke = (int)d.invoke(testBook, 1,2);
        System.out.println(invoke);
    }
}
