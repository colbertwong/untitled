package com.company;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyAnnotation {
    String value() default "";
}

@MyAnnotation(value = "Parent Value")
class Parent {
    public void myMethod() {
        System.out.println("Parent Method");
    }
}

@MyAnnotation(value = "Child Value") // 子类重写父类注解
class Child extends Parent {
    // 子类没有重写父类的方法
}

public class AnnotationExample {
    public static void main(String[] args) {
        // 获取父类上的注解
        MyAnnotation parentAnnotation = Parent.class.getDeclaredAnnotation(MyAnnotation.class);
        System.out.println("Parent Annotation value: " + parentAnnotation.value());

        // 获取子类上的注解
        MyAnnotation childAnnotation = Child.class.getDeclaredAnnotation(MyAnnotation.class);
        System.out.println("Child Annotation value: " + childAnnotation.value());
    }
}
