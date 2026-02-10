package com.coder.homework;

public class Test {
    public static void main(String[] args) {
        BookCard  card = new BookCard("红色","B");
        Student student = new Student();
        student.setName("李白");
        student.setCard(card);

        LibAdmin admin = new LibAdmin();
        admin.setName("杜甫");
        admin.check(student);

    }
}
