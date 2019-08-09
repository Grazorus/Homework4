package ru.yusdm.stud.lesson_4_oop_continue.homework;

public class LibraryDemo {

    public static void main(String[] args) {
        Library library = new Library();

        initData(library);

        library.printAuthors();
        library.printBooks();
    }

    private static void initData(Library library) {
        InputBook inputBook1 = new InputBook();
        inputBook1.setName("Zolotaya rybka");
        inputBook1.setPublishYear(01);
        inputBook1.setTotalPages(121);
        inputBook1.setId(0001);
        inputBook1.setGenre("Fairy Tale");
        inputBook1.setHandWrittenBook(true);
        Book book1 = valueOf(inputBook1);

        InputBook inputBook2 = new InputBook();
        inputBook2.setName("Rusla and Ludmila");
        inputBook2.setPublishYear(02);
        inputBook2.setTotalPages(327);
        inputBook2.setId(0002);
        inputBook2.setGenre("Drama");
        inputBook2.setPrintedBook(true);
        Book book2 = valueOf(inputBook2);

        InputBook inputBook3 = new InputBook();
        inputBook3.setName("1 and 2");
        inputBook3.setPublishYear(023);
        inputBook3.setTotalPages(3272);
        inputBook3.setId(00024);
        inputBook3.setGenre("Drama");
        inputBook3.setPrintedBook(true);
        Book book3 = valueOf(inputBook3);

        InputAuthor inputAuthor = new InputAuthor();
        inputAuthor.setLastName("Pushkin");
        inputAuthor.setName("Aleksandr");
        inputAuthor.setYearOfBorn(03);
        Author author = valueOf(inputAuthor);
        author.setBooks(new Book[]{book1, book2});

        book1.setAuthors(new Author[]{author});
        book2.setAuthors(new Author[]{author});
        book3.setAuthors(new Author[]{author});


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.addAuthor(author);


    }

    private static Book valueOf(InputBook inputBook) {
        Book book = new Book();
        book.setName(inputBook.getName());
        book.setPublishYear(inputBook.getPublishYear());
        book.setTotalPages(inputBook.getTotalPages());
        book.setId(inputBook.getId());
        book.setGenre(inputBook.getGenre());
        book.setPrintedBook(inputBook.isPrintedBook());
        book.setHandWrittenBook(inputBook.isHandWrittenBook());



        return book;
    }

    private static Author valueOf(InputAuthor inputAuthor) {
        Author author = new Author(null);
        author.setLastName(inputAuthor.getLastName());
        author.setName(inputAuthor.getName());
        author.setYearOfBorn(inputAuthor.getYearOfBorn());
        return author;
    }
}
