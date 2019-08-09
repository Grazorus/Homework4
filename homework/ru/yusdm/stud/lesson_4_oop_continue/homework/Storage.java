package ru.yusdm.stud.lesson_4_oop_continue.homework;

public class Storage {
    public static final int CAPACITY = 10;
    public static Book[] books = new Book[CAPACITY];
    public static int bookIndex = 0;

    public static void increaseBookIndex() {
        bookIndex++;
    }

    public static Author[] authors = new Author[CAPACITY];
    public static int authorIndex = 0;

    public static void increaseAuthorIndex() {
        authorIndex++;
    }

    public static void increaseAuthorsStorage() {
        Author[] authors = new Author[authorIndex + CAPACITY];
        System.arraycopy(authorIndex, 0, authors, 0 ,CAPACITY   );
//        for (int i = 0; i < Storage.authors.length; i++) {
//           authors[i] = Storage.authors[i];
//        }
        Storage.authors = authors;
    }

    public static void addAuthor(Author author) {
        author.setId(System.currentTimeMillis());
        //System.out.println("authorIndex :" + authorIndex);
        if (authorIndex % (CAPACITY) == 0 && authorIndex != 0) {
            increaseAuthorsStorage();
           // System.out.println("new array " + authors);
        } else {
            authors[authorIndex] = author;
            System.out.println("new array " + authors);
        }

        Storage.increaseAuthorIndex();
    }
}
