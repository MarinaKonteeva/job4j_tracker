package ru.job4j.pojo;

import java.sql.SQLOutput;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Пост", 400);
        Book book2 = new Book("Текст", 300);
        Book book3 = new Book("Метро", 3000);
        Book book4 = new Book("Clean code", 500);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getStr());
        }
        System.out.println();
        Book b = books[0];
        books[0] = books[3];
        books[3] = b;

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getStr());
        }
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getStr());
            }
        }
    }
}
