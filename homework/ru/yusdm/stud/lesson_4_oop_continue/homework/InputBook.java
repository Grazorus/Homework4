package ru.yusdm.stud.lesson_4_oop_continue.homework;

public class InputBook {

    private String name;
    private int publishYear;
    private int totalPages;
    private long id;
    private String genre;
    private boolean handWrittenBook;
    private boolean printedBook;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
}

