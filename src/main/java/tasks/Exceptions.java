package tasks;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions {

    static class A {
        public void fun1() throws IOException {
            throw new IOException();
        }

        public void fun2() throws IOException {
            throw new IOException();
        }

        public void fun3() throws IOException {
            throw new IOException();
        }

        public void fun4() throws IOException {
            throw new IOException();
        }
    }

    static class B extends A {
        @Override
        public void fun1() throws FileNotFoundException {
            throw new IOException();
        }

        @Override
        public void fun2() {
        }

        public void fun3() throws Exception {
            throw new IOException();
        }

        @Override
        public void fun4() throws FileNotFoundException, IllegalArgumentException {
            throw new IllegalArgumentException();
        }
    }
}