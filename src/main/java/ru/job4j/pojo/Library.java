package ru.job4j.pojo;

public class Library {

    public static void swap(Book[] array, int source, int dest) {
        Book temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
    }

    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 464);
        Book lordOfTheRing = new Book("Lord of the Rings", 1000);
        Book batmanReturns = new Book("Batmen. Returns", 500);
        Book kolobok = new Book("Kolobok", 10);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = lordOfTheRing;
        books[2] = batmanReturns;
        books[3] = kolobok;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " qty of pages : " + bk.getPages());
        }
        swap(books, 0, 3);
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " qty of pages : " + bk.getPages());
        }
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if ("Clean Code".equals(bk.getName())) {
                System.out.println(bk.getName() + " qty of pages : " + bk.getPages());
            }
        }
    }
}
