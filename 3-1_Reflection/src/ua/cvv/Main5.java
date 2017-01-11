package ua.cvv;

class Other{}

public class Main5 {
    class My{}

    public static void main(String[] args) {
        final Integer i = 777;

        Class<?> cls1 = i.getClass();
        Class<?> cls2 = Integer.class;
        Class<?> cls3 = My.class;
        Class<?> cls4 = Other.class;

        System.out.println(cls1 + "\n" + cls2 + "\n" + cls3 + "\n" + cls4); //prints their toString() methods not their own class

        System.out.println( cls1.getClass().equals(cls2.getClass()) );
        System.out.println( Integer.class.equals(My.class) );
        System.out.println( cls1.getClass().getName() + " " + cls3.getClass().getName() );
    }
}