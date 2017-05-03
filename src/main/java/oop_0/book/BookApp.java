package oop_0.book;
import java.util.Random;

public class BookApp {
    public static Random rand = new Random();
    public static Book[] book = {
        new Book(0, "Божественная комедия", "Данте Алигьери", "Эксмо", 1317, 610, 75.10, "мягкий"),
        new Book(1, "Капитанская дочка", "Стейнбек Джон", "Азбука", 1939, 583, 100.99, "мягкий" ),
        new Book(2, "Фауст", "Иоганн Гёте", "Азбука", 1832, 400 , 110.50, "твердный"),
        new Book(3, "Фирма", "Джон Гришэм", "АСТ", 1842, 480, 115.25, "мягкий"),
        new Book(4, "Власть страха", "Джеффри Дивер", "АСТ", 2002, 350, 110.99, "твердный")
    };
    
    public static void main(String[] args) {
        showBook(book);
        System.out.println("\n==================================\n");
        System.out.println("СПИСОК КНИГ ЗАДАННОГО АВТОРА: ");
        System.out.println("\n==================================\n");
        showAuthor(book, "Джеффри Дивер");
        System.out.println("\n==================================\n");
        System.out.println("СПИСОК КНИГ ЗАДАННОГО ИЗДАТЕЛЬСТВА: ");
        System.out.println("\n==================================\n");
        showPublisher(book, "АСТ");
        System.out.println("\n==================================\n");
        System.out.println("СПИСОК КНИГ ПОСЛЕ ЗАДАННОГО ГОДА: ");
        System.out.println("\n==================================\n");
        showYear(book, 1939);
    }
        
    public static void showBook(Book[] book){
        for(int i = 0; i < book.length; i++){
            System.out.println(book[i].printBook());
        }
    }
    
    public static void showAuthor(Book[] book, String author){
        for(int i = 0; i < book.length; i++){
            if(book[i].getAuthor() == author){
                System.out.println(book[i].printBook());
            }
        }
    }
    
    public static void showPublisher(Book[] book, String publisher){
        for(int i = 0; i < book.length; i++){
            if(book[i].getPublisher() == publisher){
                System.out.println(book[i].printBook());
            }
        }
    }
    
    public static void showYear(Book[] book, int publishYear){
        for(int i = 0; i < book.length; i++){
            if(book[i].getPublishYear() >= publishYear){
                System.out.println(book[i].printBook());
            }
        }
    }
}
