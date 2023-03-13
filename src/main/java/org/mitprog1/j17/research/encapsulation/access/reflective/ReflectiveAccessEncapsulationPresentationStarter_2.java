package org.mitprog1.j17.research.encapsulation.access.reflective;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectiveAccessEncapsulationPresentationStarter_2 {

    public static void main(String[] args) throws ReflectiveOperationException {
        // Exception handling elided
        Class<?> clz = Class.forName("sun.invoke.util.BytecodeName");
        Method method = clz.getDeclaredMethod("parseBytecodeName", String.class);
        Object res = method.invoke(null, "java/lang/String");
        System.out.println(Arrays.toString((Object[])res));
    }

}
