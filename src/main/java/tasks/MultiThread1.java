package tasks;

import java.util.ArrayList;
import java.util.List;

public class MultiThread1 {
    static class A {
        volatile int a = 1;
    }

    public void test1() throws Exception {
        int threadCount = 100;

        A a = new A();
        Runnable job = () -> {
            for (int i = 0; i < 10; i++) {
                a.a++;
            }
        };
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < threadCount; i++) {
            Thread t1 = new Thread(job);
            t1.start();
            threads.add(t1);
        }
        System.out.println(a.a);
    }
}
