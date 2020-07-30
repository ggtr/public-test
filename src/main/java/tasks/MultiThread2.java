package tasks;

class Robot {
    public void stepLeft() {
        System.out.println("_/");
    }

    public void stepRight() {
        System.out.println("\\_");
    }
}

public class MultiThread2 {

    public static void main(String[] argds) {
        Robot r = new Robot();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                r.stepLeft();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                r.stepRight();
            }
        });

        t1.start();
        t2.start();
    }
}
