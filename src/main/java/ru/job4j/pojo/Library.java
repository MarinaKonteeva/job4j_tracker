package ru.job4j.pojo;

import java.sql.SQLOutput;

public class Library {
    private static void printArray(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getStr());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Пост", 400);
        books[1] = new Book("Текст", 300);
        books[2] = new Book("Метро", 3000);
        books[3] = new Book("Clean code", 500);
        printArray(books);
        Book b = books[0];
        books[0] = books[3];
        books[3] = b;
        printArray(books);
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getStr());
            }
        }
    }
}
