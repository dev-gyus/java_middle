package nested.test.ex1;

import java.awt.print.Book;

public class Library {

    private final Book[] bookShelf;
    private int bookCount;
    // 코드 작성
    public Library(int size) {
        bookShelf = new Book[size];
    }

    public void addBook(String title, String author) {
        if (bookCount >= bookShelf.length) {
            System.out.println("최대치");
            return;
        }
        bookShelf[bookCount++] = new Book(title, author);
    }

    public void showBooks() {
        for(int idx = 0; idx < bookCount; idx++) {
            System.out.println("title: " + bookShelf[idx].title + ", author: " + bookShelf[idx].author);
        }
    }


    private class Book {
        private final String title;
        private final String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

    }
}
