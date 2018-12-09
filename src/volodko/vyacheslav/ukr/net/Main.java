package volodko.vyacheslav.ukr.net;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        MyClass mc = new MyClass();
        Class<?> MyClass = mc.getClass();
        Method method = MyClass.getDeclaredMethod("result", int.class, int.class);
        Test t = method.getAnnotation(Test.class);
        System.out.println("Result-" + method.invoke(mc, t.a(), t.b()));
    }
}


