package ua.cvv;

public class Main6 {
    public static void main(String[] args) {
        final Integer i = 777;
        final String s = "1234";
        final String ss = "ssss";

        System.out.println(i.getClass().equals(s.getClass()));
        System.out.println(ss.getClass().equals(s.getClass()));
        System.out.println(ss.getClass() == s.getClass());
    }
}
