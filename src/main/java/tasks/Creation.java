package tasks;

public class Creation {
    static class A {
        int a = getA() + 1;

        public int getA() {
            return a;
        }
    }

    static class B extends A {
        static int b = 2;
        int c = 3;

        @Override
        public int getA() {
            return a + b + c;
        }
    }

    public static void main(String[] args){
        B b = new B();
        System.out.println(b.a + " " + b.getA());
    }
}
