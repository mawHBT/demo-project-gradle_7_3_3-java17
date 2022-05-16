package demo.project.gradle;

public class Callee {

    protected void method1() {
        innerMethod();
    }

    protected void method2() {
        System.out.println("Not called by any Test!");
    }

    private void innerMethod() {
        try {
            Thread.sleep(1);
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
    }

}
