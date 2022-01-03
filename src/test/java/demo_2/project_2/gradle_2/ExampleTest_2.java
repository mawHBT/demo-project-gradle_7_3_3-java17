package demo_2.project_2.gradle_2;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import demo.project.gradle.ExampleClass;

public class ExampleTest_2 {

   @Test
   public void test_2() {
      final ExampleClass exampleClazz = new ExampleClass();
      exampleClazz.calleeMethod();
      assertNotNull(exampleClazz);
   }

}
