package tasks;

import java.util.HashSet;
import java.util.Set;

public class Collections1 {
    static class A {
        int a = 1;
    }

    public static void main(String[] args) {
        Set<A> setofA = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            A a = new A();
            setofA.add(a);
        }
        System.out.println(setofA.size());
    }
}
