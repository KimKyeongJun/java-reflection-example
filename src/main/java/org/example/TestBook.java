package org.example;

public class TestBook {

    public static String A = "A";

    private String B = "B";

    public TestBook() {

    }

    public TestBook(String b) {
        this.B = b;
    }

    private void c() {
        System.out.println("C");
    }

    public int sum(int left, int right) {
        return left + right;
    }
}
