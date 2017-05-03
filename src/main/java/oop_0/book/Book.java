package oop_0.book;

public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int publishYear;
    private int pages;
    private double price;
    private String binding;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public String getPublisher(){
        return publisher;
    }
    
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    
    public int getPublishYear(){
        return publishYear;
    }
    
    public void setPublishYear(int publishYear){
        this.publishYear = publishYear;
    }
    
    public int getPages(){
        return pages;
    }
    
    public void setPages(int pages){
        this.pages = pages;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public String getBinding(){
        return binding;
    }
    
    public void setBinding(String binding){
        this.binding = binding;
    }
    
    public Book(){
    }
    
    public Book(int id, String title, String author, String publisher,
                int publishYear, int pages, double price, String binding){
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.pages = pages;
        this.price = price;
        this.binding = binding;
    }
    
    public String printBook(){
        return "Book: \n" + "id: " + id + "\n" + "Title: " + title + "\n" + 
                "Autor: " + author + "\n" + "Publisher: " + publisher + "\n" +
                "Year of publishing: " + publishYear + "\n" + "Pages: " + 
                pages + "\n" + "Price: " + price + "\n" + "Binding: " + 
                binding + "\n";
    }
}
