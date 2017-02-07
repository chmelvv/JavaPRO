package hw3_1;

/**
 * Создать аннотацию, которая принимает параметры для метода.
 Написать код, который вызовет метод, помеченный этой аннотацией, и
 передаст параметры аннотации в вызываемый метод.
 @Test(a=2, b=5)
 public void test(int a, int b) {…}
 */

public class Main {

    @Test(a=2, b=5)
    public void test(int a, int b) {
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

}
