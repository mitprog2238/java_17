package org.mitprog1.j17.research.encapsulation.access.reflective;

import java.lang.reflect.Field;
import java.util.Arrays;

public class ReflectiveAccessEncapsulationPresentationStarter {

    public static void main(String[] args) throws ReflectiveOperationException {
        byte[] value = getValue("Happy Coding, Bro !");
        System.out.println(Arrays.toString(value));
    }

    private static byte[] getValue(String string) throws ReflectiveOperationException {
        Field VALUE = String.class.getDeclaredField("value");
        VALUE.setAccessible(true);
        return (byte[]) VALUE.get(string);
    }
}
