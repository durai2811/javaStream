package com.stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DemoFive {
    public static void main(String[] args) {

        List<Book> bookList = Arrays.asList(
                new Book("The Great Gatsby", "F. Scott Fitzgerald"),
                new Book("To Kill a Mockingbird", "Harper Lee"),
                new Book("1984", "George Orwell"),
                new Book("Pride and Prejudice", "Jane Austen")
        );

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the author name or book name :");
        String lines = scanner.nextLine();
        bookList.stream().filter(line -> line.getAuthor().equals(lines) || line.getTitle().equals(lines)).forEach(System.out::println);
    }
}

class Book {
    String title;
    String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}