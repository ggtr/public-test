package tasks;

import java.util.HashSet;
import java.util.Set;

public class Collections2 {
    static class A {
        int a = 1;
    }

    public static void main(String[] args) {
        Set<A> setofA = new HashSet<>();
        A a = new A();
        setofA.add(a);
        a.a = 2;
        System.out.println(setofA.contains(a));
    }
}
