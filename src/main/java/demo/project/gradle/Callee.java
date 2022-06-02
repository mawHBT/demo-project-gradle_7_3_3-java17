package demo.project.gradle;

public class Callee {

    protected void method1() {
        innerMethod();
    }

    private void innerMethod() {
        System.out.println("innerMethod");
        try {
            System.out.println("Sleeping!");
            Thread.sleep(30);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
