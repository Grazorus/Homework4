package ru.yusdm.stud.lesson_4_oop_continue.homework;

import java.util.Arrays;

public class Book {

    private Long id;
    private String name;
    private int publishYear;
    private int totalPages;
    private Author[] authors;
    private String genre;
    private boolean handWrittenBook;
    private boolean printedBook;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isHandWrittenBook() {
        return handWrittenBook;
    }

    public void setHandWrittenBook(boolean handWrittenBook) {
        this.handWrittenBook = handWrittenBook;
    }

    public boolean isPrintedBook() {
        return printedBook;
    }

    public void setPrintedBook(boolean printedBook) {
        this.printedBook = printedBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publishYear=" + publishYear +
                ", totalPages=" + totalPages +
                ", authors=" + Arrays.toString(authors) +
                ", genre='" + genre + '\'' +
                ", handWrittenBook='" + handWrittenBook + '\'' +
                ", printedBook='" + printedBook + '\'' +
                '}';
    }

}
