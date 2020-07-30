package tasks;

import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.TreeSet;

public class Collections3 {
    static class B implements Comparable<B> {
        int b = 1;

        @Override
        public int compareTo(@NotNull B o) {
            return Integer.compare(b, o.b);
        }
    }

    public static void main(String[] args) {
        Set<B> setofB = new TreeSet<>();
        B b = new B();
        setofB.add(b);
        b.b = 2;
        System.out.println(setofB.contains(b));
    }
}
