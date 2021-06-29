package com.Besharp.java.javalessons.ref;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Hmayak Atayan on 29, June, 2021
 **/
public class RefDemo {
    public static void main(String[] args) {
        Class reflection = RefObject.class;

        System.out.println(reflection.getName());
        System.out.println(reflection.getSimpleName());

        System.out.println("-------------------");
        field();

        System.out.println("-------------------");
        field2();

        System.out.println("--------------------------");
        setAndGet();
//
        System.out.println("----------------");
        methods();
//
        System.out.println(" ===========================");
        method2();
//
//        System.out.println("1111");
//        constructor();

    }

    private static void field() {
        Class<RefObject> ref = RefObject.class;
        Field[] fields = ref.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }

    private static void field2() {
        Class ref = RefObject.class;
        Field[] fields = ref.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }

    static void setAndGet() {
        try {
            Class ref = RefObject.class;
            Field field = ref.getDeclaredField("range");
            System.out.println("field.getName() = " + field.getName());

            RefObject refObj = new RefObject();
//            field.setAccessible(true);
            field.set(refObj, 10.5);

            System.out.println("value = " + field.get(refObj));
        } catch (NoSuchFieldException | IllegalAccessException ex) {
            ex.printStackTrace();
        }
    }

    static void methods() {
        try {
            Class ref = RefObject.class;
            Method method = ref.getDeclaredMethod("method1");
            RefObject obj = new RefObject();
            method.setAccessible(true);
            method.invoke(obj, null);
        } catch (NoSuchMethodException exception) {
            exception.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    static void method2() {
        try {
            Class<RefObject> ref = RefObject.class;
            Method method = ref.getDeclaredMethod("method2", String.class);
            RefObject obj = new RefObject();
            method.setAccessible(true); //todo
            method.invoke(obj, "Hamik");
        } catch (NoSuchMethodException exception) {
            exception.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    static void constructor() {
        Class<RefObject> ref = RefObject.class;
//        Constructor [] constructors = ref.getDeclaredConstructors();
//        for (Constructor constructor: constructors ){
//            System.out.println(constructor.getName());
//        }

        try {

            Constructor constructor = ref.getConstructor(null);
            RefObject refObject = (RefObject) constructor.newInstance(null);
            refObject.print();
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException ex) {
            ex.printStackTrace();
        }
    }
}
