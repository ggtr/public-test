package tasks;

import java.io.Serializable;

public class SerializableTest {
    static class A {
        int a = 1;
    }

    static class B extends A implements Serializable {
        int b = 2;
    }

    public static void main(String[] args) {
        B b = new B();
        System.out.println(deserialize(serialize(b)).equals(b));
    }
}
